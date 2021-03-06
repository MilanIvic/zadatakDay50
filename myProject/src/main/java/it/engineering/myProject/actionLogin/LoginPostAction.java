package it.engineering.myProject.actionLogin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;

import it.engineering.myProject.action.AbstractAction;
import it.engineering.myProject.constants.MyConstants;
import it.engineering.myProject.domain.User;
import it.engineering.myProject.storage.UserStorage;
@Component
public class LoginPostAction extends AbstractAction{

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		User user = login(request);
		
		if (user!=null) {
			if(!logged(user)) {
				UserStorage.getInstance().addLogged(user);
				HttpSession session = request.getSession(true);
				
				//postojeci korisnik sistema ima password, napravi novog bez password-a
				User loginUser  = user.clone();
				//user.setPassword(null);
				session.setAttribute("loginUser", loginUser);
				System.out.println(session.getAttribute("loginUser"));
				return MyConstants.VIEW_HOME;
			}
			else {
				request.setAttribute("error_message", "Korisnik je vec ulogovan!");
				return MyConstants.VIEW_LOGIN;
			}
			
		}else {
			//ubaciti poruku za korisnika
			request.setAttribute("error_message", "Korisnik ne postoji!");
			return MyConstants.VIEW_LOGIN;
		}
	}

	private boolean logged(User user) {
		List<User>listaLog = UserStorage.getInstance().getloggedUsers();
		for(User logUser : listaLog) {
			if(logUser.equals(user)) {
				return true;
			}
		}
		return false;
	}

	private User login(HttpServletRequest request) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		List<User> users = UserStorage.getInstance().getUsers();
		for (User current : users) {
			if (current.getUsername().equals(user.getUsername()) & 
					current.getPassword().equals(user.getPassword())) return current;
		}
		
		return null;
	}

	}


