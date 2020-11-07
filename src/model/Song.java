package model;

public class Song{
	private String tittle;
	private String artist;
	private String releaseDate;
	private int duration;
	private MusicalGenre musicalGenre;
	
	public Song(String tittle, String artist, String releaseDate, int duration, String musicalGenre){
		this.tittle=tittle;
		this.artist=artist;
		this.releaseDate=releaseDate;
		this.duration=duration;
		setMusicalGenre(musicalGenre);
		
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
	
	public void setMusicalGenre(String musicalGenre){
		switch(musicalGenre){
			case "1":
				this.musicalGenre=MusicalGenre.Rock;
				break;
				
			case "2":
				this.musicalGenre=MusicalGenre.Hip_hop;
				break;
				
			case "3":
				this.musicalGenre=MusicalGenre.Clasic_Music;
				break;
				
			case "4":
				this.musicalGenre=MusicalGenre.Reggae;
				break;
				
			case "5":
				this.musicalGenre=MusicalGenre.Salsa;
				break;
				
			case "6":
				this.musicalGenre=MusicalGenre.Metal;
				break;
				
		}
	}
	
	public String getMusicalGenre(){
		return musicalGenre.toString();
		
	}
}