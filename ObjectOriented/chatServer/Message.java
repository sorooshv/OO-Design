package chatServer;

import java.util.Date;

public class Message {
	private String text;
	private User user;
	private Date time;
	
	public Message(User u, String text , Date time){
		this.user = user;
		this.text = text;
		this.time = time;
	}

	public User getUser() {
		return user;
	}

	public Date getTime() {
		return time;
	}

	public String getText() {
		return text;
	}
	
	
}
