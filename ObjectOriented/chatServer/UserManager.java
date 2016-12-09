package chatServer;

import java.util.HashMap;

public class UserManager {
	
	private HashMap<Integer,User> users = new HashMap<Integer,User>();
	private int id = 0;
	
	public void addUser(String name, String email){
		User u = new User(id, name, email);
		this.users.put(id, u);
		id++;
	}
	
	public void deleteUser(int id){
		this.users.remove(id);
	}
}
