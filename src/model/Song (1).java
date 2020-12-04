package model;

public class Song{
	private String tittle;
	private String artist;
	private String releaseDate;
	private int duration;
	private Genre genre;
	
	public Song(String tittle, String artist, String releaseDate, int duration, String genre){
		this.tittle=tittle;
		this.artist=artist;
		this.releaseDate=releaseDate;
		this.duration=duration;
		setGenre(genre);
		
	}
	
	public void setTittle(String tittle){
		this.tittle=tittle;
		
	}
	
	public String getTittle(){
		return tittle;
		
	}
	
	public void setArtist(String artist){
		this.artist=artist;
		
	}
	
	public String getArtist(){
		return artist;
		
	}
	
	public void setReleaseDate(String releaseDate){
		this.releaseDate=releaseDate;
		
	}
	
	public String getReleaseDate(){
		return releaseDate;
		
	}
	
	public void setDuration(int duration){
		this.duration=duration;
		
	}

	public double getDuration(){
		return duration;
		
	}
	
	public void setGenre(String genre){
		switch(genre){
			case "1":
				this.genre=Genre.Rock;
				break;
				
			case "2":
				this.genre=Genre.Hip_hop;
				break;
				
			case "3":
				this.genre=Genre.Musica_clasica;
				break;
				
			case "4":
				this.genre=Genre.Reggae;
				break;
				
			case "5":
				this.genre=Genre.Salsa;
				break;
				
			case "6":
				this.genre=Genre.Metal;
				break;
				
		}
	}
	
	public String getGenre(){
		return genre.toString();
		
	}
}