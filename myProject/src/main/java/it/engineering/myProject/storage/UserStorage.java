package it.engineering.myProject.storage;

import java.util.ArrayList;
import java.util.List;

import it.engineering.myProject.database.UserCRUD;
import it.engineering.myProject.domain.Proizvodjac;
import it.engineering.myProject.domain.User;


public class UserStorage {
	private List<User>users;
	private List<User>loggedUsers;
	private static UserCRUD userCrud;
	private static UserStorage instance;
	
	public UserStorage(){
		userCrud = new UserCRUD();
		users = new ArrayList<User>();
		loggedUsers = new ArrayList<User>();
	}
	
	
	
	public static UserStorage getInstance() {
		if (instance == null) instance = new UserStorage();
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





