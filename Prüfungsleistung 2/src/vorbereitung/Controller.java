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
		String input1 = inputTF1.getText();
		Model model = Model.getInstance();
		double input01 = Double.parseDouble(input1);
		model.setInitCapital(input01);
	}
	
}
