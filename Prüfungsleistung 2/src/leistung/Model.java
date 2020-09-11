package leistung;

public class Model {

	/*
	 * Singelton implementierung
	 */	
	private static Model model;
	
	private Model(){}
	
	public Model getInstance() {
		if (model != null) {
			model = new Model();
		}
		return model;
	}
	
	/*
	 * Model-Bereich
	 */
	
	/*
	 * Attribute
	 */
	Game game = new Game();
	Genre genre = new ;
	String yearofRelease = new String();
	String system = new String();
	Boolean playedThrough = null;




	public String getTitle() {
		String title = game.getTitel();
		return title;
	}

	public void setTitle(String title) {
		game.setTitel(title);
	}
	
	
	
	
	

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	
	
	
	
	public String getYearofRelease() {
		return yearofRelease;
	}

	public void setYearofRelease(String yearofRelease) {
		this.yearofRelease = yearofRelease;
	}

	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	public Boolean getPlayedThrough() {
		return playedThrough;
	}

	public void setPlayedThrough(Boolean playedThrough) {
		this.playedThrough = playedThrough;
	}
	
	
	
	
	
	
	
	
	
}






















