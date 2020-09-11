package leistung;

public enum ConsoleSystem {
	
	PS4("PS4"),XBOXONE("XBOXONE"),Switch("Switch");
	/*
	 * Attribute
	 */
	private String description;
	private String abberivation;
	/*
	 * Methoden
	 */
	ConsoleSystem(String description) {
		this.description = description;
		this.abberivation = description;
	}
	public String getDescription() {
		return description;
	}
	public String getAbberivation() {
		return abberivation;
	}


}
