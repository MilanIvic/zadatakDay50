package it.engineering.myProject.database.impl;

import java.sql.ResultSet;
import java.util.List;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import it.engineering.myProject.database.UserDao;
import it.engineering.myProject.domain.User;
import it.engineering.myProject.persistence.MyEntityManagerFactory;

@Repository
public class UserCRUD implements UserDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<User> getListUsers(){
		String query = "select * from user";
		return jdbcTemplate.query(query, (ResultSet rs, int rowNum) -> {
			System.out.println("============= " + rowNum +" ======================");
			User user = new User();
			user.setId(rs.getLong("uid"));
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			return user;
		});
	}
	
	public void save(User user) {
		jdbcTemplate.update(
				"INSERT INTO user(firstname, lastname, username, password) VALUES (?,?)",
					user.getUsername(),
					user.getPassword()
		);
	}
	public User getUser(Long id) {
		String query = "select * from user where id = ?";
		return (User) jdbcTemplate.queryForObject(query, new Object[] {id},new BeanPropertyRowMapper(User.class));
	}
/*	public void save(User user) {
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
	}*/
}
