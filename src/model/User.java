package model;

public class User{
	private String nick;
	private String password;
	private int age;
	private Category category;
	private int sharedSongs;
	
	public User(String nick, String password, int age, String category, int sharedSongs){
		this.nick=nick;
		this.password=password;
		this.age=age;
		setCategory(category, sharedSongs);
		this.sharedSongs=sharedSongs;
		
	}
	
	public void setNick(String nick){
		this.nick=nick;

	}
	
	public String getNick(){
		return nick;
		
	}
	
	public void setPassword(String password){
		this.password=password;
	
	}
	
	public String getPassword(){
		return password;
		
	}
	
	public void setAge(int age){
		this.age=age;
		
	}
	
	public int getAge(){
		return age;
		
	}
	
	public void setCategory(String category, int sharedSongs){
		if(sharedSongs>=0 && sharedSongs<3){
			this.category=Category.Newbie;
			
		}
		
		else if(sharedSongs>=3 && sharedSongs<10){
			this.category=Category.Little_Contributor;
			
		}
		
		else if(sharedSongs>=10 && sharedSongs<30){
			this.category=Category.Mild_Contributor;
			
		}
		
		else if(sharedSongs>=30){
			this.category=Category.Star_Contributor;
			
		}
	}
	
	public String getCategory(){
		return category.toString();
		
	}
	
	public void setSharedSongs(int sharedSongs){
		this.sharedSongs=sharedSongs;
		
	}
	
	public int getSharedSongs(){
		return sharedSongs;
		
	}
}