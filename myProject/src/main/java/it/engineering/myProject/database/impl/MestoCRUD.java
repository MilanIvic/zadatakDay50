package it.engineering.myProject.database.impl;

import java.util.List;

import javax.persistence.EntityManager;

import it.engineering.myProject.database.MestoDao;
import it.engineering.myProject.domain.Mesto;
import it.engineering.myProject.persistence.MyEntityManagerFactory;

public class MestoCRUD implements MestoDao{
	public List<Mesto>getMestoList(){
		EntityManager em = MyEntityManagerFactory
				.getEntityManagerFactory().createEntityManager();
		
		List<Mesto> mestoList = em.createNamedQuery("Mesto.findAll", Mesto.class).getResultList();
		return mestoList;
	}
	
	public Mesto getById(Long id) {
		EntityManager em = MyEntityManagerFactory.getEntityManagerFactory()
				.createEntityManager();
		
		em.getTransaction().begin();
		
		
		Mesto m = em.find(Mesto.class, id);
		em.close();
		return m;
	}
}
