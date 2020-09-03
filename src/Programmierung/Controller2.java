package Programmierung;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller2 implements Initializable {

	@FXML TextField ausgabe;

	@FXML public void pressed(ActionEvent event) throws IOException {
		Node node = (Node) event.getSource();
		Scene oldScene = node.getScene();
		Stage stage = (Stage) oldScene.getWindow();

		Parent root = FXMLLoader.load(getClass().getResource("view.fxml"));
		Scene newScene = new Scene(root);
		stage.setTitle("Demo 2.9: Eingabe");
		stage.setScene(newScene);
		stage.show();	
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
			Model model = Model.getInstance();
			ausgabe.textProperty().bind(model.getTextProperty());
	}

}
