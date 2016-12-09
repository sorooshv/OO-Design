package chatServer;

import java.util.HashMap;

public class ChatRoomManager {
	
	private HashMap<Integer,ChatRoom> rooms = new HashMap<Integer,ChatRoom>();
	private int id = 0;
	
	public ChatRoom addChatRoom(String name){
		ChatRoom c = new ChatRoom(id, name);
		this.rooms.put(id, c);
		id++;
		return c;
	}
	
	public void addUserToRoom(int id, User u){
		ChatRoom c = rooms.get(id);
		c.addUserToRoom(u);
	}
	
	public void removeUserFromRoom(int id, User u){
		ChatRoom c = rooms.get(id);
		c.removeUserFromRoom(u);
		if(c.getSize() == 0)
			rooms.remove(c.getId());
	}
	
	public ChatRoom getChatRoom(int id){
		return rooms.get(id);
	}
	
	public void deleteChatRoom(int id){
		this.rooms.remove(id);
	}
}
