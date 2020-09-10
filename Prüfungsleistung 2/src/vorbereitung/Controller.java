package vorbereitung;

 
import java.io.IOException;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
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
	
	JOptionPane jOptionPane = new JOptionPane(); 
	Alert alert = new Alert(AlertType.WARNING);
	
	
	@FXML
	public void pressedButton(ActionEvent calculate) throws IOException {
		Model model = Model.getInstance();
		boolean isCorrect = false;
		
		try {
			
		
			try {
				String inputString1 = input1.getText(); 
				double inputDouble = Double.parseDouble(inputString1);
				model.setInitCapital(inputDouble);	
				isCorrect = true;
			} catch (Exception e) {		
				alert.setContentText("Bitte eine Zahl einfügen");
				alert.setHeaderText("Ungültige Eingabe");
				alert.show();
				isCorrect = false;
			}
			
			
			try {
				String inputString2 = input2.getText();
				double inputZins = Float.parseFloat(inputString2);
				model.setZins(inputZins);
				isCorrect = true;
			} catch (Exception e) {	
				alert.setContentText("Bitte eine Zahl einfügen");
				alert.setHeaderText("Ungültige Eingabe");
				alert.show();
				isCorrect = false;
			}
			
			try {
				String inputString3 = input3.getText();
				double inputRunTime = Double.parseDouble(inputString3);
				model.setRunTime(inputRunTime);
				isCorrect = true;
			} catch (Exception e) {
				alert.setContentText("Bitte eine Zahl einfügen");
				alert.setHeaderText("Ungültige Eingabe");
				alert.show();
				isCorrect = false;
			}					
		} catch (Exception e) {
			alert.setHeaderText("Ungültige Eingabe");
			alert.setContentText("Ihre Angaben sind nicht gültig");
			alert.show();
		}
		if(isCorrect == true) {
			Scene oldScene = calcButton.getScene();
			Stage stage = (Stage) oldScene.getWindow();

			Parent root = FXMLLoader.load(getClass().getResource("View2.fxml"));
			Scene scene = new Scene(root);
			stage.setTitle("Engabefenster");
			stage.setScene(scene);
			stage.show();
		}		
	}

	
}

