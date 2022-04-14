package it.engineering.myProject.action.proizvodjac;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.myProject.action.AbstractAction;
import it.engineering.myProject.constants.MyConstants;

public class AddProAction extends AbstractAction{

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return MyConstants.PAGE_ADD_PRO;
	}

}
