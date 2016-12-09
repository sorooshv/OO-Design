package jukebox;

public class Display {
	private String Message;
	private boolean change = false;
	
	public void displayMessage(){
		System.out.println(this.Message);
	}
	
	public void setMessage(Song song){
		this.Message = "Playing " + song.getSongName() + " , by " 
						+ song.getArtist();
		madeChange();
	}
	
	private void madeChange(){
		this.change = true;
	}
}
