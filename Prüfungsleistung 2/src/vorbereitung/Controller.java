package vorbereitung;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class Controller {
	
	@FXML
	Button calcButton;
	

	@FXML Label label1;

	@FXML Label label2;

	@FXML Label label3;

	@FXML Label label4;

	@FXML Label resLabel;

	@FXML TextField input1;

	@FXML TextField input2;

	@FXML TextField input3;
	
	@FXML
	public void pressedButton(ActionEvent calculate) {
		Model model = Model.getInstance();
				
		String inputString1 = input1.getText(); 
		double inputDouble = Double.parseDouble(inputString1);
		model.setInitCapital(inputDouble);
		
		String inputString2 = input2.getText();
		float inputFloat = Float.parseFloat(inputString2);
		model.setZins(inputFloat);
		
		String inputString3 = input3.getText();
		int inputInt = Integer.parseInt(inputString3);
		model.setRunTime(inputInt);
	}

	@FXML public void calculate(ActionEvent event) {}
	
}
