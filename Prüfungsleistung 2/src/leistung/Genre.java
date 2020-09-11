package leistung;

public enum Genre {

	Action("Action"),ActionAdventure("ActionAdventure"),
	RPG("RPG"),Sport("Sport"),Strategy("Strategy"),
	Simulation("Simulation");
	/*
	 * Attribute
	 */
	private String description;
	Genre(String description) {
		this.description = description;
	}
	/*
	 * Methoden
	 */
	public String getDescription() {
		return description;
	}
}
