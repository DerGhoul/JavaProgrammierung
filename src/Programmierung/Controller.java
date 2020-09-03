package Programmierung;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class Controller implements Initializable {

	@FXML TextArea eingabefeld;
	@FXML Button press;
	@FXML MediaView mediaPlayer;
	
	
	
	@FXML public void pressed()  {
		String a = eingabefeld.getText();
	}


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Model model = Model.getInstance();
		eingabefeld.textProperty().bindBidirectional(model.getTextProperty());
		mediaPlayer.getClass().getResource("");
	}


	@FXML public void pressedtonewpage() throws IOException {
		Scene oldScene = eingabefeld.getScene();
		Stage stage = (Stage) oldScene.getWindow();
		
		Parent root = FXMLLoader.load(getClass().getResource("view2.fxml"));
		Scene scene = new Scene(root);
		stage.setTitle("�bertrag");
		stage.setScene(scene);
		stage.show();
	}


	
	
	

}
