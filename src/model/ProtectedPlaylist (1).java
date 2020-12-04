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
	
	@Override
	public String getAllowedUsers(){
		String users="";
		
		for(int i=0; i<allowedUsers.length; i++){
			users+=allowedUsers[i] + " - ";
			
		}
		
		return users;
	}
	
	@Override
	public String getInfo(){
		String allInfo=getBasicInfo();
		
		allInfo+="\n**  Allowed users: " + getAllowedUsers() + "\n***********************************";
		
		return allInfo;
	}
}