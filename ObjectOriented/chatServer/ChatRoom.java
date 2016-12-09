package chatServer;

import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;

public class ChatRoom {
	private LinkedList<Message> messages = new LinkedList<Message>();
	private HashSet<User> users = new HashSet<User>();
	private int id;
	private String name;
	private Display display = new Display();
	private int size= 0;
	
	public ChatRoom(int id, String name){
		this.name = name;
		this.id = id;
	}
	
	public void addUserToRoom(User u){
		this.users.add(u);
		size++;
	}
	
	public void removeUserFromRoom(User u){
		this.users.remove(u);
		size--;
	}
	
	public void sendMessage(User u, String message){
		Message m = new Message(u, message, new Date());
		messages.add(m);
		display.update();
	}
	
	public int getId(){
		return id;
	}
	
	public int getSize(){
		return size;
	}
}
