package leistung;

public enum ConsoleSystem {
	
	PS4("Playstation 4"),XONE("X Box One"),Switch("Nintendo Switch");
	
	private String description;
	ConsoleSystem(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
	
	private String Abbreviation;
	ConsoleSystem(String Abbreviation) {
		this.Abbreviation = Abbreviation;
	}
	public String getDescription() {
		return Abbreviation;
	}


}
