package it.engineering.myProject.action.proizvodjac;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.myProject.action.AbstractAction;
import it.engineering.myProject.constants.MyConstants;
import it.engineering.myProject.domain.Mesto;
import it.engineering.myProject.domain.Proizvodjac;
import it.engineering.myProject.storage.ProizvodjacStorage;

public class ProizvodjacViewAction extends AbstractAction{

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		Proizvodjac pro = ProizvodjacStorage.getInstance().getProizvodjac(Long.parseLong(request.getParameter("pib")));
		if(pro != null) {
			Mesto mesto = pro.getMesto();
			request.setAttribute("mesto", mesto);
			request.setAttribute("pro", pro);
			return MyConstants.PAGE_PROIZVODJAC_VIEW;
		}
		else {
			request.setAttribute("proizvodjaci", ProizvodjacStorage.getInstance().getAllPro());
			return MyConstants.PAGE_PROIZVODJACI;
		}
		
	}

}
