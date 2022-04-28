package it.engineering.myProject.database;

import java.util.List;

import it.engineering.myProject.domain.Proizvodjac;

public interface ProizvodjacDao {
	public void save(Proizvodjac proiz);
	public void delete(String id);
	public Proizvodjac getById(String id);
	public List<Proizvodjac>getProList();
	public void updatePro(Proizvodjac proiz);
}
