package it.engineering.myProject.database;

import java.util.List;

import javax.persistence.EntityManager;

import it.engineering.myProject.domain.User;
import it.engineering.myProject.persistence.MyEntityManagerFactory;


public class UserCRUD {
	
	public void save(User user) {
		EntityManager em = MyEntityManagerFactory.getEntityManagerFactory()
					.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(user);
		System.out.println("Sacuvan je user");
		
		em.getTransaction().commit();
		em.close();
	
	}
	public User getUser(Long id) {
		EntityManager em = MyEntityManagerFactory
				.getEntityManagerFactory()  //returns emf instance
				.createEntityManager();
		
		em.getTransaction().begin();
		
		User user = em.find(User.class, id);
		em.close();
		return user;
	}
	
	public List<User> getListUsers(){
		EntityManager em = MyEntityManagerFactory.getEntityManagerFactory()
				.createEntityManager();
	
		em.getTransaction().begin();
		List<User>usersList = em.createNamedQuery("User.findAll", User.class).getResultList();
		em.close();
		return usersList;
	}
}
