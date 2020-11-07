package model;

public class PublicPlaylist extends Playlist{
	private double average;
	
	public PublicPlaylist(String name, int duration, String genres, double average){
		super(name, duration, genres);
		this.average=average;
		
	}
	
	public void setAverage(double average){
		this.average=average;
		
	}
	
	public double getAverage(){
		return average;
		
	}
}