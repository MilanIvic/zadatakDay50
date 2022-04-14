package it.engineering.myProject.action.proizvodjac;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.myProject.action.AbstractAction;
import it.engineering.myProject.constants.MyConstants;
import it.engineering.myProject.domain.Proizvodjac;
import it.engineering.myProject.storage.ProizvodjacStorage;

public class ProizvodjacEditOrRemoveAction extends AbstractAction{

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		if(request.getParameter("button").equals("Obrisi")) {
			ProizvodjacStorage.getInstance().removePro(Long.parseLong(request.getParameter("pib")));
			request.setAttribute("proizvodjaci", ProizvodjacStorage.getInstance().getAllPro());
			return MyConstants.PAGE_PROIZVODJACI;
		}
		return null;
	}

}