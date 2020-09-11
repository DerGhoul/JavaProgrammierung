package leistung;

public enum OperatingSystem {

	MS_Windows("Microsoft_Windows"),MacOS("macOS"),Linux("Linux"),
	IOS("iOS"),Android("Android");
	
	private String description;
	OperatingSystem(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
}
