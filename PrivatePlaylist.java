package model;

public class PrivatePlaylist extends Playlist{
	private String allowedUser;
	
	public PrivatePlaylist(String name, int duration, String genres, String allowedUser){
		super(name, duration, genres);
		this.allowedUser=allowedUser;
		
	}
	
	public void setAllowedUser(String allowedUser){
		this.allowedUser=allowedUser;
		
	}
	
	public String getAllowedUser(){
		return allowedUser;
		
	}
}