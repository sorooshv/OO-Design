package jukebox;

import java.util.ArrayList;

public class Player {
	private ArrayList<Song> playlist;
	private int playlistIndex = 0;
	private Song playing = null;
	private boolean isPlaying = false;
	
	public void play(Song song){
		this.playlist = null;
		this.playing = song;
		this.isPlaying = true;
	}
	
	public void play(){
		this.isPlaying = true;
	}
	
	public void stop(){
		this.isPlaying = false;
	}
	
	public void next(){
		if(this.playlist != null){
			nextIndex();
			play(fetchSong(getIndex()));
		}
	}
	
	public void previous(){
		if(this.playlist != null){
			preIndex();
			play(fetchSong(getIndex()));
		}
	}
	
	public void addToPlaylist(Song song){
		if(this.playlist == null)
			this.playlist = new ArrayList<Song>();
		else
			this.playlist.add(song);
	}
	
	private Song fetchSong(int index){
		return this.playlist.get(index);
	}
	
	private int getIndex(){
		return this.playlistIndex;
	}
	
	private void preIndex(){
		this.playlistIndex--;
	}
	
	private void nextIndex(){
		this.playlistIndex++;
	}
	
}
