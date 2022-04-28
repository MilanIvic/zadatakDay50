package it.engineering.myProject.action.proizvodjac;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.myProject.action.AbstractAction;
import it.engineering.myProject.constants.MyConstants;
import it.engineering.myProject.domain.Proizvodjac;
import it.engineering.myProject.storage.ProizvodjacStorage;

public class ProizvodjacDeleteAction extends AbstractAction{

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		if(request.getParameter("button").equals("Da")) {
				ProizvodjacStorage.getInstance().removePro(request.getParameter("pib"));
				request.setAttribute("proizvodjaci", ProizvodjacStorage.getInstance().getAllPro());
				return MyConstants.VIEW_PROIZVODJACI;
		}
		else {
			request.setAttribute("proizvodjaci", ProizvodjacStorage.getInstance().getAllPro());
			return MyConstants.VIEW_PROIZVODJACI;
		}
	}

}
