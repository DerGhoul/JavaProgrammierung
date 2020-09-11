package leistung;

public class PcGame extends Game{
	/*
	 * Attribute
	 *os Abkürzung von operatingSystem auf deutsch Betriebssystem
	 *sR Abkürzung von systemRequirements auf deutsch Systemanforderungen
	 */
	private String oS;
	private String sR;
	
	/*
	 * Methoden
	 */
	public void setOS (String oS) {
		this.oS = oS; }
	public void setSR (String sR) {
		this.sR = sR; }
	
	public String getOS() {
		return oS; }
	public String getSR() {
		return sR; }
}
