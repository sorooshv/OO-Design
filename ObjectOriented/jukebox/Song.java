package jukebox;

import java.time.Duration;

public class Song {
	private String artist;
	private String songName;
	public String getArtist() {
		return artist;
	}

	public String getSongName() {
		return songName;
	}

	public int getLength() {
		return length;
	}

	private int length;
	
	public Song(String artist, String name, int length){
		this.artist = artist;
		this.songName = name;
		this.length = length;
	}
}
