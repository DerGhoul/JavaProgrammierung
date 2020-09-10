package vorbereitung;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Controller2 {

	@FXML 
	Label label4;
	
	@FXML
	Label label5;
	
	@FXML
	Button backButton;
	
	@FXML
	public void backToInputView(ActionEvent goBack) throws Exception {
		Scene oldScene = backButton.getScene();
		Stage stage = (Stage) oldScene.getWindow();
		
		Parent root = FXMLLoader.load(getClass().getResource("View1.fxml"));
		Scene newScene = new Scene(root);
		stage.setTitle("Ergebnis");
		stage.setScene(newScene);
		stage.show();
	}
	
	
	
}
