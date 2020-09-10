package vorbereitung;

import java.net.URL;
import java.util.ResourceBundle;

import javax.naming.spi.InitialContextFactory;

import com.sun.javafx.css.CalculatedValue;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Controller2 implements Initializable {

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
		Scene scene = new Scene(root);
		stage.setTitle("Demo 2.10");
		stage.setScene(scene);
		stage.setHeight(500);
		stage.setWidth(700);
		stage.show();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		label5.setText(Model.getInstance().calculateZins()+"");
		
	}
	
	
}
