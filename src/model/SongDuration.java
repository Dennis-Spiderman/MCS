package model;
public class SongDuration{
		private int hour;
		private int minute;
		private int second;
		
	public SongDuration (int minute, int second){
		this.minute=minute;
		this.second=second;
		
	}
	public int getHour(){
		return hour;
	}
	public void setHour(int hour){
		this.hour=hour;
	}
	public int getMinute(){
		return minute;
	}
	public void setMinute(int minute){
		this.hour=hour;
	}
	public int getSecond(){
		return second;
	}
	public void setSecond(int second){
		this.second=second;
	}
	
	public String getSongDurationInfo(){
	String info = getMinute()+":"+getSecond();
	return info;
	}
}
	
