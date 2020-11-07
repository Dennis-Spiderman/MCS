package model;

public class Playlist{
	private String name;
	private int duration;
	private String genres;
	private Song[] songsInThePlaylist;
	
	public Playlist(String name, int duration, String genres){
		this.name=name;
		this.duration=duration;
		this.genres=genres;
		songsInThePlaylist=new Song[30];
		
	}
	
	public void setName(String name){
		this.name=name;
		
	}
	
	public String getName(){
		return name;
		
	}
	
	public void setDuration(int duration){
		this.duration=duration;
		
	}
	
	public int getDuration(){
		return duration;
		
	}
	
	public Song[] getSongsInThePlaylist(){
		return songsInThePlaylist;
		
	}
	
	public void setGenre(String genres){
		this.genres=genres;
		
	}
	
	public String getGenre(){
		return genres;
		
	}
}