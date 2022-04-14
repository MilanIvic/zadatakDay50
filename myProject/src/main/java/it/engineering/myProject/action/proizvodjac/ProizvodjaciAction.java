package it.engineering.myProject.action.proizvodjac;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.myProject.action.AbstractAction;
import it.engineering.myProject.constants.MyConstants;
import it.engineering.myProject.storage.ProizvodjacStorage;

public class ProizvodjaciAction extends AbstractAction{

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("proizvodjaci", ProizvodjacStorage.getInstance().getAllPro());
		return MyConstants.PAGE_PROIZVODJACI;
	}

}
