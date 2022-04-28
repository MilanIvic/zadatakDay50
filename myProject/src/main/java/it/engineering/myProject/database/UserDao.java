package it.engineering.myProject.database;

import java.util.List;

import it.engineering.myProject.domain.User;

public interface UserDao {
	public List<User> getListUsers();
	public void save(User user);
	public User getUser(Long id);
}
