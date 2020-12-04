package model;

public abstract class Playlist{
	private String name;
	private int duration;
	private String genres;
	private Song[] songsInThePlaylist;
	
	private String allowedUser;
	private String users;
	private double average;
	
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
		duration=0;
		
		for(int i=0; i<songsInThePlaylist.length; i++){
			if(songsInThePlaylist[i]!=null){
				duration+=songsInThePlaylist[i].getDuration();
				
			}
		}
		
		return duration;
	}
	
	public Song[] getSongsInThePlaylist(){
		return songsInThePlaylist;
		
	}
	
	public String getGenresSong(){
		String genresSong="";
		
		for(int i=0; i<songsInThePlaylist.length; i++){
			if(songsInThePlaylist[i]!=null){
				genresSong=songsInThePlaylist[i].getGenre() + "-";
		
			}
		}
		
		return genresSong;
	}
	
	public String filter(){
		String filter="";
		String aux=getGenresSong();
		String[] aux1=aux.split("-");
		String aux2;
		
		for(int i=0; i<aux1.length; i++){
			for(int j=0; j<6; j++){
				aux2=Genre.values()[j].toString();
				
				if(aux1[i].equalsIgnoreCase(aux2)){
					filter+=aux2 + " - ";
					
					j=6;
				}
				
				else{
					filter+="";
				}
			}
		}
		
		return filter;
	}
	
	public void setGenre(String genres){
		this.genres=genres;
		
	}
	
	public String getGenre(){
		return genres;
		
	}
		
	public String getAllowedUser(){
		return allowedUser;
		
	}
	
	public String getAllowedUsers(){
		return users;
		
	}
	
	public double getAverage(){
		return average;
		
	}
	
	public void addSong(Song songs){
		for(int i=0; i<songsInThePlaylist.length; i++){
			if(songsInThePlaylist[i]==null){
				songsInThePlaylist[i]=songs;
				
				i=songsInThePlaylist.length;
			}
		}
	}
	
	public abstract String getInfo();
	
	public String getBasicInfo(){
		String basicInfo="";
		
		
		basicInfo+="\n**************  Playlist  **************\n**  Title: " + getName() + "\n**  Duration: " +
		getDuration() + "\n**  Genres: " + filter();
		
		return basicInfo;
	}
	
	public void changeMarks(double userMark){
		
	}
}