package it.engineering.myProject.storage;

import java.util.ArrayList;
import java.util.List;

import it.engineering.myProject.database.impl.UserCRUD;
import it.engineering.myProject.domain.User;

public class UserStorageJpa {
	private List<User>users;
	private List<User>loggedUsers;
	private static UserCRUD userCrud;
	private static UserStorageJpa instance;
	
	public UserStorageJpa(){
		userCrud = new UserCRUD();
		users = new ArrayList<User>();
		loggedUsers = new ArrayList<User>();
	}
	
	
	
	public static UserStorageJpa getInstance() {
		if (instance == null) instance = new UserStorageJpa();
		return instance;
	}
	
	public List<User> getUsers() {
		users = userCrud.getListUsers();
		return users;
	}
	public void addLogged(User user){
		loggedUsers.add(user);
	}
	public List<User> getloggedUsers() {
		return loggedUsers;
	}
	public void logout(User user) {
		User remUser=null;
		for(User userL : loggedUsers) {
			if(userL.getUsername().equals(user.getUsername())) {
				remUser = userL;
			}
		}
		loggedUsers.remove(remUser);
	}
}
