package it.engineering.myProject.storage;

import java.util.ArrayList;
import java.util.List;

import it.engineering.myProject.database.UserCRUD;
import it.engineering.myProject.domain.Proizvodjac;
import it.engineering.myProject.domain.User;


public class UserStorage {
	private List<User>users;
	private List<String>loggedUsers;
	private static UserCRUD userCrud;
	private static UserStorage instance;
	
	public UserStorage(){
		userCrud = new UserCRUD();
		users = new ArrayList<User>();
		loggedUsers = new ArrayList<String>();
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
		loggedUsers.add(user.getUsername());
	}
	public List<String> getloggedUsers() {
		return loggedUsers;
	}
	
}





