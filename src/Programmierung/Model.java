package Programmierung;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Model {

	private static Model model;
	
	private Model() {}
	
	public static Model getInstance() {
		if (model == null) {
			model = new Model();
		}
		return model;
	}
	
	private StringProperty textProperty = new SimpleStringProperty();
	
	public StringProperty getTextProperty() {
		return textProperty;
	}
	
}
