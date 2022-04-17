package it.engineering.myProject.action.logout;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.engineering.myProject.action.AbstractAction;
import it.engineering.myProject.constants.MyConstants;
import it.engineering.myProject.domain.User;
import it.engineering.myProject.storage.UserStorage;



public class LogoutAction extends AbstractAction {

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("loginUser");
		UserStorage.getInstance().logout(user);
		session.removeAttribute("loginUser");
		session.invalidate();
		session = request.getSession(false);
		return MyConstants.PAGE_INDEX;
	}

}
