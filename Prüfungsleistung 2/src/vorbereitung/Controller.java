package vorbereitung;

 
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class Controller {
	
	@FXML
	Button calcButton;
	

	@FXML Label label1;

	@FXML Label label2;

	@FXML Label label3;

	@FXML Label resLabel;

	@FXML TextField input1;

	@FXML TextField input2;

	@FXML TextField input3;
	
	@FXML
	public void pressedButton(ActionEvent calculate) throws IOException {
		Model model = Model.getInstance();
		
		String inputString1 = input1.getText(); 
		double inputDouble = Double.parseDouble(inputString1);
		model.setInitCapital(inputDouble);
		
		String inputString2 = input2.getText();
		double inputZins = Float.parseFloat(inputString2);
		model.setZins(inputZins);
		
		String inputString3 = input3.getText();
		double inputRunTime = Double.parseDouble(inputString3);
		model.setRunTime(inputRunTime);
		
		
		
		
		Scene oldScene = calcButton.getScene();
		Stage stage = (Stage) oldScene.getWindow();

		Parent root = FXMLLoader.load(getClass().getResource("View2.fxml"));
		Scene scene = new Scene(root);
		stage.setTitle("Engabefenster");
		stage.setScene(scene);
		stage.show();
	}

	
}

