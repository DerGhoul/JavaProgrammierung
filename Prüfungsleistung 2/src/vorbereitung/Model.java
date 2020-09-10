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
	public double getInitCapital() {
		return initCapital;
	}
	public float getZins() {
		return zins;
	}
	public int getRunTime() {
		return runTime;
	}
	public void setInitCapital(double initCapital) {
		this.initCapital = initCapital;
	}
	public void setZins(float zins) {
		this.zins = zins;
	}
	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}
}
