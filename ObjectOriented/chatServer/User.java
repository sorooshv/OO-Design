package chatServer;

public class User {
	private int id;
	private String name;
	private String email;
	private boolean online;
	private ChatRoom room = null;
	private ChatRoomManager crManager= new ChatRoomManager();
	


	public User(int id, String name, String email){
		this.id = id;
		this.name = name;
		this.email = email;
		this.online = true;
	}

	public void joinChatRoom(int id){
		crManager.addUserToRoom(id, this);
	}
	
	public void createChatRoom(String name){
		room = crManager.addChatRoom(name);
		crManager.addUserToRoom(room.getId(), this);
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getId() {
		return id;
	}
	
	public boolean isOnline() {
		return online;
	}
	
	public void signOff(){
		if(room != null)
			crManager.removeUserFromRoom(room.getId(), this);
		this.online = false;
	}
	
	public void signOn(){
		this.online = true;
	}
	
}
