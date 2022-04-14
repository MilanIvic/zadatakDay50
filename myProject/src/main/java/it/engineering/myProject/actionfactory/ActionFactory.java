package it.engineering.myProject.actionfactory;

import it.engineering.myProject.action.AbstractAction;
import it.engineering.myProject.action.proizvodjac.ProizvodjacEditOrRemoveAction;
import it.engineering.myProject.action.proizvodjac.ProizvodjacSaveOrUpdateAction;
import it.engineering.myProject.action.proizvodjac.ProizvodjacViewAction;
import it.engineering.myProject.action.proizvodjac.ProizvodjaciAction;
import it.engineering.myProject.actionLogin.LoginGetAction;
import it.engineering.myProject.actionLogin.LoginPostAction;
import it.engineering.myProject.constants.MyConstants;

public class ActionFactory {
	public static AbstractAction createAction(String method, String path) {
		AbstractAction action = null;
		
		switch (path) {
		case MyConstants.PATH_LOGIN:
			if (method.equalsIgnoreCase("GET")) action = new LoginGetAction();
			if (method.equalsIgnoreCase("POST")) action = new LoginPostAction();
			break;
		case MyConstants.PATH_PROIZVODJACI:
			if(method.equalsIgnoreCase("GET")) {
				action = new ProizvodjaciAction();
			}
			if(method.equalsIgnoreCase("POST")) {
				action = new ProizvodjacSaveOrUpdateAction();
			}
			break;
		case MyConstants.PATH_PROIZVODJAC_VIEW:
			action = new ProizvodjacViewAction();
			break;
		case MyConstants.PATH_PROIZVODJAC_EDIT_DELETE:
			action = new ProizvodjacEditOrRemoveAction();
			break;
		}
		
		
		return action;
	}
}
