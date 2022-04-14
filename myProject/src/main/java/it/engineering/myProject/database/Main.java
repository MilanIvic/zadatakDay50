package it.engineering.myProject.database;



import java.util.List;

import it.engineering.myProject.domain.Mesto;
import it.engineering.myProject.domain.Proizvodjac;
import it.engineering.myProject.domain.User;
import it.engineering.myProject.storage.ProizvodjacStorage;
import it.engineering.myProject.storage.UserStorage;

public class Main {
	private static UserCRUD userCrud;
	private static ProizvodjacCRUD proCrud;
	
	public Main() {
		userCrud = new UserCRUD();
		proCrud = new ProizvodjacCRUD();
	}
	
	public static void saveUser(User user) {
		userCrud.save(user);
	}
	
	public void saveProizvodjac(Proizvodjac pro) {
		proCrud.save(pro);
	}
	public void removeProizv(Long id) {
		proCrud.delete(id);
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
	public void printAllPro() {
		List<Proizvodjac> prList = proCrud.getProList();
		for(Proizvodjac proi : prList) {
			System.out.println(proi);
		}
	}
	public static void main(String[] args) {
	//	Main main = new Main();
		
	//	User user = new User("user1","user1");
	//	Mesto mes = new Mesto(12000L,"Pozarevac");
	//	Proizvodjac pro = new Proizvodjac(123456L,"987654","Bulevar revolucije 23",mes);
		//main.saveUser(user);
	//	main.findUserById(1L);
	//	main.printAll();
	//	Proizvodjac pr = ProizvodjacStorage.getInstance().getProizvodjac(pro.getPib());
	//	pr.setAdresa("Milana Ivica 18a");
	//	ProizvodjacStorage.getInstance().removePro(pr.getPib());
		//	main.saveProizvodjac(new Proizvodjac(222222L,"07070707","Dragana Mancea 11",new Mesto(11000L,"Beograd")));
	//	main.removeProizv(pro);
	//	List<Proizvodjac> lista = ProizvodjacStorage.getInstance().getAllPro();
	//	System.out.println(lista);
	//	System.out.println(proCrud.getById((long) 666666));
		//main.saveProizvodjac(pro);
	//	pro.setAdresa("Marsala Zukova 23");
	//	System.out.println("Da vidimo pro da li cuva update: "+pro);
	//	System.out.println(proCrud.getById(pro.getPib()));
	//	proCrud.updatePro(pro);
	//	System.out.println(proCrud.getById(pro.getPib()));
		
	}

}
