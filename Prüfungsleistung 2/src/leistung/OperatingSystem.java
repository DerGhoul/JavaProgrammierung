package leistung;

public enum OperatingSystem {

	MS_Windows("MS_Windows"),MacOS("macOS"),Linux("Linux"),
	IOS("IOS"),Android("Android");
	
	private String description;
	OperatingSystem(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
}
