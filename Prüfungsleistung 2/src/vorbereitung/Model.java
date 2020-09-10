package vorbereitung;

public class Model {

	private double initCapital;
	private float zins;
	private int runTime;
	
	private static Model instance;
	
	private Model() {
		
	}
	
	public static Model getInstance() {
		if(instance == null) {
			instance= new Model();
		}
		return instance;
	}
	private double calculateZins() {
		double result = initCapital * (zins / 100) * runTime;
		return result;
	}
	
	public double getInitCapital() {
		return initCapital;
	}
	public float getZins() {
		return zins;
	}
	public int getRunTime() {
		return runTime;
	}
	public void setInitCapital() {
		this.initCapital = initCapital;
	}
	public void setZins() {
		this.zins = zins;
	}
	public void setRunTime() {
		this.runTime = runTime;
	}
}
