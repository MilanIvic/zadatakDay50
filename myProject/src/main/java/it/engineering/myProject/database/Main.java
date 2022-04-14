package it.engineering.myProject.database;



import java.util.List;

import it.engineering.myProject.domain.User;
import it.engineering.myProject.storage.UserStorage;

public class Main {
	private static UserCRUD userCrud;
	
	public Main() {
		userCrud = new UserCRUD();
	}
	
	public static void saveUser(User user) {
		userCrud.save(user);
	}
	public static void findUserById(Long id) {
		User user = userCrud.getUser(id);
		System.out.println(user.getUsername());
	}
	
	public void printAll() {
		List<User>userList = UserStorage.getInstance().getUsers();
		for(User usr : userList) {
			System.out.println(usr);
		}
	}
	public static void main(String[] args) {
		Main main = new Main();
		
		User user = new User("user1","user1");
		//main.saveUser(user);
		main.findUserById(1L);
		main.printAll();
		
	}

}
