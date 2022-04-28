package it.engineering.myProject.actionLogin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import it.engineering.myProject.action.AbstractAction;
import it.engineering.myProject.constants.MyConstants;

@Component
public class LoginGetAction extends AbstractAction{

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return MyConstants.VIEW_LOGIN;
	}

}
