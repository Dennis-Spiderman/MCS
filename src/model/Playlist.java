package model;

public class Playlist{
	private String name;
	private int duration;
	private MusicalGenre[] musicalGenres;
	
	public Playlist(String name, int duration){
		this.name=name;
		this.duration=duration;
		musicalGenres=new MusicalGenre[20];
		
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
}