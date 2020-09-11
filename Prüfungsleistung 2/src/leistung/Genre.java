package leistung;

public enum Genre {

	Action("Action_Spiel"),ActionAdventure("Action-Adventure"),
	RPG("Rollenspiel"),Sport("Sport_Spiel"),Strategy("Strategie_Spiel"),
	Simulation("Simulation");
	
	private String description;
	Genre(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
}
