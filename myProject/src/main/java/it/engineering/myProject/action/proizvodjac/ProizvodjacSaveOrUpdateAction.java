package it.engineering.myProject.action.proizvodjac;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.myProject.action.AbstractAction;
import it.engineering.myProject.constants.MyConstants;
import it.engineering.myProject.domain.Mesto;
import it.engineering.myProject.domain.Proizvodjac;
import it.engineering.myProject.storage.MestoStorage;
import it.engineering.myProject.storage.ProizvodjacStorage;

public class ProizvodjacSaveOrUpdateAction extends AbstractAction{

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		String proPib = request.getParameter("pib");
		String matBr = request.getParameter("matBr");
		String adresa = request.getParameter("adress");
		String mestoStr = request.getParameter("mesto");
		String mestoPtt="";
		for(int i=0; i<mestoStr.length();i++) {
			char ch = mestoStr.charAt(i);
			if(Character.isDigit(ch)) {
				mestoPtt = mestoPtt+ch;
			}
			else {
				continue;
			}
		}
		Mesto mesto = MestoStorage.getInstance().getMesto(Long.parseLong(mestoPtt));
		Proizvodjac pro = ProizvodjacStorage.getInstance().getProizvodjac(proPib);
		if(pro !=null) {
			pro.setAdresa(adresa);
			pro.setMaticniBroj(matBr);
			pro.setMesto(mesto);
			ProizvodjacStorage.getInstance().update(pro);
			request.setAttribute("proizvodjaci", ProizvodjacStorage.getInstance().getAllPro());
			return MyConstants.VIEW_PROIZVODJACI;
		}
		else {
			Proizvodjac newPro = new Proizvodjac(proPib, matBr, adresa, mesto);
			ProizvodjacStorage.getInstance().addPro(newPro);
			request.setAttribute("proizvodjaci", ProizvodjacStorage.getInstance().getAllPro());
			return MyConstants.VIEW_PROIZVODJACI;
		}
	}

}
