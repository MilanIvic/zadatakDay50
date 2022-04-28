package it.engineering.myProject.view;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import it.engineering.myProject.constants.MyConstants;
@Component
public class ViewResolver {
	private Map<String,String>map;
	public ViewResolver() {
		this.map=new HashMap<String,String>();
		map.put(MyConstants.VIEW_LOGIN, MyConstants.PAGE_LOGIN);
		map.put(MyConstants.VIEW_HOME, MyConstants.PAGE_HOME);
		map.put(MyConstants.VIEW_PROIZVODJACI, MyConstants.PAGE_PROIZVODJACI);
		map.put(MyConstants.VIEW_PROIZVODJAC, MyConstants.PAGE_PROIZVODJAC_VIEW);
		map.put(MyConstants.VIEW_PROIZVODJAC_EDIT, MyConstants.PAGE_PROIZVODJAC_EDIT);
		map.put(MyConstants.VIEW_ADD_PRO, MyConstants.PAGE_ADD_PRO);
		map.put(MyConstants.VIEW_INDEX, MyConstants.PAGE_INDEX);
		map.put(MyConstants.VIEW_CONFIRM, MyConstants.PAGE_PRO_CONFIRM);
	}
	public String getPage(String view) {
		return map.get(view);
	}
}
