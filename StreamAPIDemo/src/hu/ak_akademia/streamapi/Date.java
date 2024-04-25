package hu.ak_akademia.streamapi;

public class Date {
	
	private final int year;
	private final int month;
	private final int day;
	public Date(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	@Override
	public String toString() {
		return year + ". " + month + ". " + day + ".";
	}
	
	
	

}
