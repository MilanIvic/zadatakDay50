package it.engineering.myProject.action.proizvodjac;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.myProject.action.AbstractAction;
import it.engineering.myProject.constants.MyConstants;
import it.engineering.myProject.domain.Mesto;
import it.engineering.myProject.storage.MestoStorage;

public class AddProAction extends AbstractAction{

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		List<Mesto> mesta= MestoStorage.getInstance().getAllMesto();
		request.setAttribute("mesta", mesta);
		return MyConstants.VIEW_ADD_PRO;
	}

}
