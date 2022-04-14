package it.engineering.myProject.persistence;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class MyEntityManagerFactory {
	private EntityManagerFactory emf; //instanca EMF-a
	private static MyEntityManagerFactory instance; // instanca ove klase
	
	private MyEntityManagerFactory() {
		emf = Persistence.createEntityManagerFactory("myProject"); //u konstruktoru kreira emf
	}
	
	public static EntityManagerFactory getEntityManagerFactory() {
		if(instance == null) {                                    //singleton 
			instance = new MyEntityManagerFactory();
		}
		return instance.getEmf();
	}
	private EntityManagerFactory getEmf() {
		return emf;
	}
	
	public static void closeEntityManagerFactory() {
		if(instance !=null) instance.getEmf().close();
	}
}
