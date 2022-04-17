package it.engineering.myProject.actionfactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import it.engineering.myProject.action.AbstractAction;
import it.engineering.myProject.action.logout.LogoutAction;
import it.engineering.myProject.action.proizvodjac.AddProAction;
import it.engineering.myProject.action.proizvodjac.ProizvodjacEditOrRemoveAction;
import it.engineering.myProject.action.proizvodjac.ProizvodjacSaveOrUpdateAction;
import it.engineering.myProject.action.proizvodjac.ProizvodjacViewAction;
import it.engineering.myProject.action.proizvodjac.ProizvodjaciAction;
import it.engineering.myProject.actionLogin.IndexAction;
import it.engineering.myProject.actionLogin.LoginGetAction;
import it.engineering.myProject.actionLogin.LoginPostAction;
import it.engineering.myProject.constants.MyConstants;
import it.engineering.myProject.domain.User;


public class ActionFactory {
	public static AbstractAction createAction(HttpServletRequest request, String method, String path) {
		AbstractAction action = null;
		
		HttpSession session = request.getSession(true);
		User user = (User) session.getAttribute("loginUser");
		System.out.println("User dohvacen iz sesije "+user);
		
		switch (path) {
		case MyConstants.PATH_LOGIN:
			if (method.equalsIgnoreCase("GET")) action = new LoginGetAction();
			if (method.equalsIgnoreCase("POST")) action = new LoginPostAction();
			break;
		case MyConstants.PATH_PROIZVODJACI:
			if(method.equalsIgnoreCase("GET")) {
				if(user == null) {
					action = new IndexAction();
				}
				else {
					action = new ProizvodjaciAction();
				}
			}
			if(method.equalsIgnoreCase("POST")) {
				if(user == null) {
					action = new IndexAction();
				}
				else {
					action = new ProizvodjacSaveOrUpdateAction();
				}
			}
			break;
		case MyConstants.PATH_PROIZVODJAC_VIEW:
			if(user == null) {
				action = new IndexAction();
			}
			else {
				action = new ProizvodjacViewAction();
			}
			break;
		case MyConstants.PATH_PROIZVODJAC_EDIT_DELETE:
			if(user == null) {
				action = new IndexAction();
			}
			else {
				action = new ProizvodjacEditOrRemoveAction();
			}
			break;
		case MyConstants.PATH_ADD_PRO:
			if(user == null) {
				action = new IndexAction();
			}
			else {
				action = new AddProAction();
			}
			break;
		case MyConstants.PATH_LOGOUT:
			if(user == null) {
				action = new IndexAction();
			}
			else {
				action = new LogoutAction();
			}
			break;
		default:
			break;
		}
		
		
		return action;
	}
}
