package it.engineering.myProject.storage;

import java.util.ArrayList;
import java.util.List;

import it.engineering.myProject.database.impl.MestoCRUD;
import it.engineering.myProject.domain.Mesto;


public class MestoStorage {
	private List<Mesto>listMesto;
	private static MestoCRUD mestoCrud;
	private static MestoStorage instance;
	
	public MestoStorage() {
		mestoCrud = new MestoCRUD();
		listMesto = new ArrayList<>();
	}
	
	public static MestoStorage getInstance() {
		if(instance == null) {
			instance = new MestoStorage();
		}
		return instance;
	}
	
	public List<Mesto> getAllMesto(){
		listMesto = mestoCrud.getMestoList();
		return listMesto;
	}
	public Mesto getMesto(Long id) {
		Mesto m = mestoCrud.getById(id);
		return m;
	}
}
