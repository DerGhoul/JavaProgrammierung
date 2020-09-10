package vorbereitung;

import javafx.beans.property.StringProperty;

public class Model {

	private double initCapital;
	private double zins;
	private double runTime;
	
	private static Model instance;
	
	
	
	private Model() {
		
	}
	
	public static Model getInstance() {
		if(instance == null) {
			instance= new Model();
		}
		return instance;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public double calculateZins() {
		double result = (initCapital * (zins / 100) * runTime) + initCapital ;
		return result;
	}
	
	public double getInitCapital() {
		return initCapital;
	}
	public double getZins() {
		return zins;
	}
	public double getRunTime() {
		return runTime;
	}
	public void setInitCapital(double initCapital) {
		this.initCapital = initCapital;
	}
	public void setZins(double inputZins) {
		this.zins = inputZins;
	}
	public void setRunTime(double inputRunTime) {
		this.runTime = inputRunTime;
	}
}
