package leistung;

public class PcGame extends Game{
	/*
	 * Attribute
	 *os Abkürzung von Operating System auf deutsch Betriebssystem
	 */
	private String oS;
	//sR Abkürzung von systemRequirements auf deutsch Systemanforderungen
	private String sR;
	
	/*
	 * Methoden
	 */
	public void setOS (String o) {oS = o; }
	public void setSR (String s) {sR = s; }
	
	public String getOS() {return oS; }
	public String getSR() {return sR; }
}
