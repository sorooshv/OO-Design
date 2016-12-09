package jukebox;

public class Jukebox {
	private Display display = new Display();
	private Player player = new Player();
	
	public void play(Song song){
		player.play(song);
		display.setMessage(song);
		display.displayMessage();
	}
}
