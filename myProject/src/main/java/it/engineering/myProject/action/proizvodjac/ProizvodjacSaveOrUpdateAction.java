package it.engineering.myProject.action.proizvodjac;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.myProject.action.AbstractAction;
import it.engineering.myProject.constants.MyConstants;
import it.engineering.myProject.domain.Mesto;
import it.engineering.myProject.domain.Proizvodjac;
import it.engineering.myProject.storage.ProizvodjacStorage;

public class ProizvodjacSaveOrUpdateAction extends AbstractAction{

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		Long proPib = Long.parseLong(request.getParameter("pib"));
		String matBr = request.getParameter("matBr");
		String adresa = request.getParameter("adress");
		String mestoStr = request.getParameter("mesto");
		String mestoPtt="";
		String mestoNaziv="";
		for(int i=0; i<mestoStr.length();i++) {
			char ch = mestoStr.charAt(i);
			if(Character.isLetter(ch)) {
				mestoNaziv = mestoNaziv+ch;
			}
			else if(Character.isDigit(ch)) {
				mestoPtt = mestoPtt+ch;
			}
			else {
				continue;
			}
		}
		Long pttBroj = Long.parseLong(mestoPtt);
		Mesto mesto = new Mesto(pttBroj,mestoNaziv);
		Proizvodjac pro = ProizvodjacStorage.getInstance().getProizvodjac(proPib);
		if(pro !=null) {
			pro.setAdresa(adresa);
			pro.setMaticniBroj(matBr);
			pro.setMesto(mesto);
			ProizvodjacStorage.getInstance().update(pro);
			request.setAttribute("proizvodjaci", ProizvodjacStorage.getInstance().getAllPro());
			return MyConstants.PAGE_PROIZVODJACI;
		}
		else {
			Proizvodjac newPro = new Proizvodjac(proPib, matBr, adresa, mesto);
			ProizvodjacStorage.getInstance().addPro(newPro);
			request.setAttribute("proizvodjaci", ProizvodjacStorage.getInstance().getAllPro());
			return MyConstants.PAGE_PROIZVODJACI;
		}
	}

}
