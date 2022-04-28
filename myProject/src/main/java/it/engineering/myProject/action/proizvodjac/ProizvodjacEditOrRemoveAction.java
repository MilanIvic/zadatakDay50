package it.engineering.myProject.action.proizvodjac;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.myProject.action.AbstractAction;
import it.engineering.myProject.constants.MyConstants;
import it.engineering.myProject.domain.Mesto;
import it.engineering.myProject.domain.Proizvodjac;
import it.engineering.myProject.storage.MestoStorage;
import it.engineering.myProject.storage.ProizvodjacStorage;

public class ProizvodjacEditOrRemoveAction extends AbstractAction{

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		if(request.getParameter("button").equals("Obrisi")) {
			Proizvodjac pro = ProizvodjacStorage.getInstance().getProizvodjac(request.getParameter("pib"));
			request.setAttribute("pro", pro);
			return MyConstants.VIEW_CONFIRM;
		}
		if(request.getParameter("button").equals("Izmeni")) {
			Proizvodjac pro = ProizvodjacStorage.getInstance().getProizvodjac(request.getParameter("pib"));
			if(pro != null) {
				List<Mesto> mesta = MestoStorage.getInstance().getAllMesto();
				request.setAttribute("mesta", mesta);
				request.setAttribute("pro", pro);
				return MyConstants.VIEW_PROIZVODJAC_EDIT;
			}
			else {
				request.setAttribute("proizvodjaci", ProizvodjacStorage.getInstance().getAllPro());
				return MyConstants.VIEW_PROIZVODJACI;
			}
		}
		if(request.getParameter("button").equals("Nazad")) {
			request.setAttribute("proizvodjaci", ProizvodjacStorage.getInstance().getAllPro());
			return MyConstants.VIEW_PROIZVODJACI;
		}
		return null;
	}

}
