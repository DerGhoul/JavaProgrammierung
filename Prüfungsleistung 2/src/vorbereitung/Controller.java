package vorbereitung;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
	
	@FXML
	Button calcButton;
	
	@FXML
	TextField inputTF1;
	
	@FXML
	TextField inputTF2;
	
	@FXML
	TextField inputTF3;
	
	@FXML
	public void pressedButton(ActionEvent calculate) {
		Model model = Model.getInstance();
		
		String input1 = inputTF1.getText();
		double inputDouble = Double.parseDouble(input1);
		model.setInitCapital(inputDouble);
		
		String input2 = inputTF2.getText();
		float inputFloat = Float.parseFloat(input2);
		model.setZins(inputFloat);
		
		String input3 = inputTF3.getText();
		int inputInt = Integer.parseInt(input3);
		model.setRunTime(inputInt);
	}
	
}
