package leistung;

public enum Genre {

	Action("Action_Spiel"),ActionAdventure("Action-Adventure_Spiel"),
	RPG("Rollenspiel"),Sport("Sport_Spiel"),Strategy("Strategie_Spiel"),
	Simulation("Simulation_Spiel");
	/*
	 * Attribute
	 */
	private String description;
	Genre() {
	}
	/*
	 * Methoden
	 */
	public String getDescription() {
		return description;
	}
}
