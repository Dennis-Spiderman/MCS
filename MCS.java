package model;

public class MCS{
	private User[] users;
	private Song[] songsPool;
	public Playlist[] playlists;
	
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
				usersCreated+="\n*************  User **************\n**  UserName: " + users[i].getNickname() + "\n**  Age: " + users[i].getAge() + "\n**  Category: " + users[i].getCategory() + "\n***********************************";
				
			}
		}
		
		return usersCreated;
	}
	
	public void addSong(String tittle, String artist, String releaseDate, int duration, String genre){
		boolean created=false;
		
		for(int i = 0; i<songsPool.length && !created; i++){
			if(songsPool[i]==null){
				songsPool[i]=new Song(tittle, artist, releaseDate, duration, genre);
				created=true;
				
			}
		}
	}
	
	public String getTheSongs(){
		String song="";
		
		for(int i=0; i<songsPool.length; i++){
			if(songsPool[i]!=null){
				song+="\n**************  Song **************\n**  Title: " + songsPool[i].getTittle() + "\n**  Artist: " + songsPool[i].getArtist() + "\n**  Duration: " + songsPool[i].getDuration() + "\n**  Genre: " + songsPool[i].getGenre() + "\n***********************************";
				
			}
		}
		
		return song;
	}
	
	public void addPlaylist(String name, int duration, String genres, String allowedUser){
		boolean created=false;
		
		for(int i=0; i<playlists.length && !created; i++){
			if(playlists[i]==null){
				playlists[i]=new PrivatePlaylist(name, duration, genres, allowedUser);
				created=true;
				
			}
		}
	}
	
	public void addPlaylist(String name, int duration, String genres, String[] allowedUsers){
		boolean created=false;
		
		for(int i=0; i<playlists.length && !created; i++){
			if(playlists[i]==null){
				playlists[i]=new ProtectedPlaylist(name, duration, genres, allowedUsers);
				created=true;
				
			}
		}
	}
	
	public void addPlaylist(String name, int duration, String genres, double average){
		boolean created=false;
		
		for(int i=0; i<playlists.length && !created; i++){
			if(playlists[i]==null){
				playlists[i]=new PublicPlaylist(name, duration, genres, average);
				created=true;
				
			}
		}
	}
	
	public String refreshTheCategories(int sharedSongs){
		String categoryRefreshed="";
		
		for(int i=0; i<users.length; i++){
			if(users[i]!=null){
				if(sharedSongs>=0 && sharedSongs<3){	
					users[i].setCategory("Newbie", sharedSongs);
					categoryRefreshed="Newbie";
					
				}
				
				else if(sharedSongs>=3 && sharedSongs<10){	
					users[i].setCategory("Little_Contributor", sharedSongs);
					categoryRefreshed="Little contributor";
					
				}
				
				else if(sharedSongs>=10 && sharedSongs<30){	
					users[i].setCategory("Mild_Contributor", sharedSongs);
					categoryRefreshed="Mild contributor";
					
				}
				
				else if(sharedSongs>=30){	
					users[i].setCategory("Star_Contributor", sharedSongs);
					categoryRefreshed="Star contributor";
					
				}
			}
		}
		
		return categoryRefreshed;
	}
	
	public void addSongToThePlaylist(String songToAdd){
		Song[] songsInThePlaylist=new Song[30];
		
		for(int i=0; i<songsPool.length; i++){			
			if(songToAdd.equalsIgnoreCase(songsPool[i].getTittle())){
				for(int j=0; j<songsInThePlaylist.length; j++){
					if(songsInThePlaylist[i]==null){
						songsInThePlaylist[j]=songsPool[i];
					
					}
				}
			}
		}	
	}
	
	public String getThePlaylists(){
		String playlistsCreated="";
		
		for(int i=0; i<playlists.length; i++){
			if(playlists[i]!=null && playlists[i] instanceof PrivatePlaylist){
				playlistsCreated+="\n**************  Playlist  **************\n**  Title: " + playlists[i].getName() + "\n**  Duration: " + playlists[i].getDuration() + "\n**  Genre: " + playlists[i].getGenre() + "\n***********************************";
				
			}
			
			if(playlists[i]!=null && playlists[i] instanceof ProtectedPlaylist){
				playlistsCreated+="\n**************  Playlist  **************\n**  Title: " + playlists[i].getName() + "\n**  Duration: " + playlists[i].getDuration() + "\n**  Genre: " + playlists[i].getGenre() + "\n***********************************";
				
			}
			
			if(playlists[i]!=null && playlists[i] instanceof PublicPlaylist){
				playlistsCreated+="\n**************  Playlist  **************\n**  Title: " + playlists[i].getName() + "\n**  Duration: " + playlists[i].getDuration() + "\n**  Genre: " + playlists[i].getGenre() + "\n***********************************";
				
			}
		}
		
		return playlistsCreated;
	}
}