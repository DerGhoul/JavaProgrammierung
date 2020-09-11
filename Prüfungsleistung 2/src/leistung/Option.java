package leistung;


public class Option {
	/*
	 * Attribute
	 */
	String title;
	String genre;
	String year;
	String system;
	boolean isPlayed;

	/*
	 * Methoden
	 */
	public Option(String title, String genre,String year,String system,boolean isPlayed) {
		this.title = title;
		this.genre = genre;
		this.year = year;
		this.system = system;
		this.isPlayed = isPlayed;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	public boolean isPlayed() {
		return isPlayed;
	}

	public void setPlayed(boolean isPlayed) {
		this.isPlayed = isPlayed;
	}

	
}
