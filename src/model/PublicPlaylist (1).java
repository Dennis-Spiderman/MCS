package model;

public class PublicPlaylist extends Playlist{
	private double average;
	
	private int numOfMarks;
	private double marks;
	
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
	
	@Override
	public void changeMarks(double userMark){
		marks+=userMark;
		numOfMarks++;
		average=marks/numOfMarks;
		
	}
	
	@Override
	public String getInfo(){
		String allInfo=getBasicInfo();
		
		allInfo+="\n**  Qualification average: " + average + "\n***********************************";
		
		return allInfo;
	}
}