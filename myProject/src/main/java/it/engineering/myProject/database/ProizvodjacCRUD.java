package it.engineering.myProject.database;

import java.util.List;

import javax.persistence.EntityManager;

import it.engineering.myProject.domain.Mesto;
import it.engineering.myProject.domain.Proizvodjac;
import it.engineering.myProject.persistence.MyEntityManagerFactory;


public class ProizvodjacCRUD {
	public void save(Proizvodjac proiz) {
		EntityManager em = MyEntityManagerFactory.getEntityManagerFactory()
				.createEntityManager();
		
		em.getTransaction().begin();
		
		Mesto existsMesto = em.find(Mesto.class, proiz.getMesto().getPttBroj());
		
		if(existsMesto==null) {
			em.persist(proiz);
		}
		else {
			proiz.setMesto(existsMesto);
			em.persist(proiz);
			System.out.println("Dodat je proizvodjac");
			
		}
		em.getTransaction().commit();
		em.close();
	}
	public void delete(String id) {
		EntityManager em = MyEntityManagerFactory.getEntityManagerFactory()
				.createEntityManager();
		
		em.getTransaction().begin();
		
		Proizvodjac pro = em.find(Proizvodjac.class,id);
		if(pro !=null) {
			em.remove(pro);
		}
		em.getTransaction().commit();
		em.close();
	}
	public Proizvodjac getById(String id) {
		EntityManager em = MyEntityManagerFactory.getEntityManagerFactory()
				.createEntityManager();
		
		em.getTransaction().begin();
		
		
		Proizvodjac pro = em.find(Proizvodjac.class, id);
		em.close();
		return pro;
	}
	
	public List<Proizvodjac>getProList(){
		EntityManager em = MyEntityManagerFactory
				.getEntityManagerFactory().createEntityManager();
		
		List<Proizvodjac> proList = em.createNamedQuery("Proizvodjac.findAll", Proizvodjac.class).getResultList();
		return proList;
	}
	
	public void updatePro(Proizvodjac proiz) {
		EntityManager em = MyEntityManagerFactory.getEntityManagerFactory()
				.createEntityManager();
		
		em.getTransaction().begin();
		
		Proizvodjac pro = em.find(Proizvodjac.class, proiz.getPib());
		if(pro !=null) {
			pro.setMaticniBroj(proiz.getMaticniBroj());
			pro.setAdresa(proiz.getAdresa());
			pro.setMesto(proiz.getMesto());
			em.merge(pro);
		}
		em.getTransaction().commit();
		em.close();
	}
	
}
