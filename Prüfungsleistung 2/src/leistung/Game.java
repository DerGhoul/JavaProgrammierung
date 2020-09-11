package leistung;

public class Game {
	/*
	 * Attribute
	 */
	private String title;
	private String genre;
	private int yearOfRelease;
	private boolean playedThrough;
	/*
	 * Methoden
	 */
	public void setTitel (String t) {title = t; }
	public void setGenre (String g) {genre = g; }
	public void setYearOfRelease (int y) {yearOfRelease = y; }
	public void setPlayedThrough (boolean p) {playedThrough = p; }
	
	public String getTitel() {return title; }
	public String getGenre() {return genre; }
	public int getYearOfRelease() {return yearOfRelease; }
	public boolean getPlayedThrough() {return playedThrough; }
}
