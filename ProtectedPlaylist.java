package model;

public class ProtectedPlaylist extends Playlist{
	private String[] allowedUsers=new String[5];
	
	public ProtectedPlaylist(String name, int duration, String genres, String[] allowedUsers){
		super(name, duration, genres);
		this.allowedUsers=allowedUsers;
		
	}
	
	public void setAllowedUsers(String[] allowedUsers){
		this.allowedUsers=allowedUsers;
		
	}
	
	public String[] getAllowedUsers(){
		return allowedUsers;
		
	}
}