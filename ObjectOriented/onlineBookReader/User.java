package onlineBookReader;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String name;
	private String email;
	private int age;
	
	private List<Readable> readables;
	
	public User(String name, String email, int age){
		this.name = name;
		this.email = email;
		this.age = age;
		this.readables = new ArrayList<Readable>();
	}
	
	public void addReadable(Readable r){
		if(!this.readables.contains(r))
			this.readables.add(r);
	}
	
	public void removeReadable(Readable r){
		if(this.readables.contains(r))
			this.readables.remove(r);
	}
	
	
}
