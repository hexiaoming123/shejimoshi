package flyweightpattern.flyweight;

public class CD {
	private String title;
	private int year;
	private Artist artist;
	public CD() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CD(String title, int year, Artist artist) {
		super();
		this.title = title;
		this.year = year;
		this.artist = artist;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Artist getArtist() {
		return artist;
	}
	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	
}
