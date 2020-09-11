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
	public void setTitel (String title) {
		this.title = title; }
	public void setGenre (String genre) {
		this.genre = genre; }
	public void setYearOfRelease (int yearOfRelease) {
		this.yearOfRelease = yearOfRelease; }
	public void setPlayedThrough (boolean playedThrough) {
		this.playedThrough = playedThrough; }
	
	public String getTitel() {
		return title; }
	public String getGenre() {
		return genre; }
	public int getYearOfRelease() {
		return yearOfRelease; }
	public boolean getPlayedThrough() {
		return playedThrough; }
}
