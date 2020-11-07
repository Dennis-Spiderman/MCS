package model;

public class MCS{
	private User[] users;
	private Song[] songsPool;
	private Playlist[] playlists;
	
	public MCS(){
		users=new User[10];
		songsPool=new Song[30];
		playlists=new Playlist[20];
	}
	
	public void addUser(String name, String password, int age, String category, int sharedSongs){
		boolean created=false;
		
		for(int i = 0; i<users.length && !created; i++){
			if(users[i]==null){
				users[i]=new User(name, password, age, category, sharedSongs);
				created=true;
				
			}
		}
	}
	
	public String getTheUsers(){
		String usersCreated="";
		
		for(int i=0; i<users.length; i++){
			if(users[i]!=null){
				usersCreated+="\n*************  User **************\n**  UserName: " + users[i].getNick() + "\n**  Age: " + users[i].getAge() + "\n**  Category: " + users[i].getCategory() + "\n***********************************";
				
			}
		}
		
		return usersCreated;
	}
	
	public void addSong(String tittle, String artist, String releaseDate, int duration, String MusicalGenre){
		boolean created=false;
		
		for(int i = 0; i<songsPool.length && !created; i++){
			if(songsPool[i]==null){
				songsPool[i]=new Song(tittle, artist, releaseDate, duration, MusicalGenre);
				created=true;
				
			}
		}
	}
	
	public String getTheSongs(){
		String song="";
		
		for(int i=0; i<songsPool.length; i++){
			if(songsPool[i]!=null){
				song+="\n**************  Song **************\n**  Title: " + songsPool[i].getTittle() + "\n**  Artist: " + songsPool[i].getArtist() + "\n**  Duration: " + songsPool[i].getDuration() + "\n**  Genre: " + songsPool[i].getMusicalGenre() + "\n***********************************";
				
			}
		}
		
		return song;
	}
}