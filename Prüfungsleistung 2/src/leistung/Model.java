package leistung;

import java.nio.channels.AcceptPendingException;

import org.omg.CORBA.portable.ValueOutputStream;

import javafx.scene.chart.ValueAxis;

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
	Genre genre;
	String system = new String();
	ConsoleSystem consoleSystem;
	OperatingSystem operatingSystem;




	public String getTitle() {
		String title = game.getTitel();
		return title;
	}

	public void setTitle(String title) {
		game.setTitel(title);
	}
	
	
	
	
	

	public String getGenre() {
		return genre.getDescription();
	}

	public void setGenre(String genre) {
		if (genre == "Action") {
			this.genre = Genre.Action;
		}
		if (genre == "ActionAdventure") {
			this.genre = Genre.ActionAdventure;
		}
		if (genre == "RPG") {
			this.genre = Genre.RPG;
		}
		if (genre == "Sport") {
			this.genre = Genre.Sport;
		}
		if (genre == "Strategy") {
			this.genre = Genre.Strategy;
		}
		if (genre == "Simulation") {
			this.genre = Genre.Simulation;
		}
	}

	
	
	
	
	public String getYearofRelease() {
		return game.getYearOfRelease()+"";
	}

	public void setYearofRelease(String yearofRelease) {
		
		game.setYearOfRelease(Integer.parseInt(yearofRelease));
	}

	
	
	
	
	public String getSystem() {
		if (operatingSystem != null) {
			this.system = operatingSystem.getDescription();
			return system;
		}
		else if (consoleSystem != null) {
			this.system = consoleSystem.getDescription();
			return system;
		}
		else {
			return "";
		}
		
	}

	public void setSystem(String system) {
		if (system == "MS_Windows") {
			this.operatingSystem = OperatingSystem.MS_Windows;
		}
		if (system == "MacOS") {
			this.operatingSystem = OperatingSystem.MacOS;
		}
		if (system == "Linux") {
			this.operatingSystem = OperatingSystem.Linux;
		}
		if (system == "IOS") {
			this.operatingSystem = OperatingSystem.IOS;
		}
		if (system == "Android") {
			this.operatingSystem = OperatingSystem.Android;
		}
		
		if (system == "PS4") {
			this.consoleSystem = ConsoleSystem.PS4;
		}
		if (system == "XBOXONE") {
			this.consoleSystem = ConsoleSystem.XBOXONE;
		}
		if (system == "Switch") {
			this.consoleSystem = ConsoleSystem.Switch;
		}
	}

	
	
	
	public Boolean getPlayedThrough() {
		return game.getPlayedThrough();
	}

	public void setPlayedThrough(Boolean playedThrough) {
		game.setPlayedThrough(playedThrough);
	}
	
	
	
	
	
	
	
	
	
}






















