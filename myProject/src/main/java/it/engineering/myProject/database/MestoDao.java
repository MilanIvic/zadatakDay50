package it.engineering.myProject.database;

import java.util.List;

import it.engineering.myProject.domain.Mesto;

public interface MestoDao {
	public List<Mesto>getMestoList();
	public Mesto getById(Long id);
}
