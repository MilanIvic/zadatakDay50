package it.engineering.myProject.storage;

import java.util.ArrayList;
import java.util.List;

import it.engineering.myProject.database.ProizvodjacCRUD;
import it.engineering.myProject.domain.Proizvodjac;

public class ProizvodjacStorage {
	private List<Proizvodjac>listPro;
	private static ProizvodjacCRUD proCrud;
	private static ProizvodjacStorage instance;
	
	public ProizvodjacStorage() {
		proCrud = new ProizvodjacCRUD();
		listPro = new ArrayList<>();
	}
	
	public static ProizvodjacStorage getInstance() {
		if(instance == null) {
			instance = new ProizvodjacStorage();
		}
		return instance;
	}
	
	public List<Proizvodjac> getAllPro(){
		listPro = proCrud.getProList();
		return listPro;
	}
	public void addPro(Proizvodjac pro) {
		proCrud.save(pro);
	}
	public void removePro(Long id) {
		proCrud.delete(id);
	}
	public void update(Proizvodjac pro) {
		proCrud.updatePro(pro);
	}
	public Proizvodjac getProizvodjac(Long id) {
		Proizvodjac pro = proCrud.getById(id);
		return pro;
	}
}
