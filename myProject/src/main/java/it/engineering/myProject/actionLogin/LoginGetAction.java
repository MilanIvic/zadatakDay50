package it.engineering.myProject.actionLogin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.myProject.action.AbstractAction;
import it.engineering.myProject.constants.MyConstants;

public class LoginGetAction extends AbstractAction{

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return MyConstants.PAGE_LOGIN;
	}

}
