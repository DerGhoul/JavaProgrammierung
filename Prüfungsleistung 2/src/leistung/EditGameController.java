package leistung;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class EditGameController {

	
	@FXML Label newGameTitle;
	@FXML CheckBox editGameFinishedInput;
	@FXML Label editGameGameFinished;
	@FXML RadioButton newGameSystemInputMG;
	@FXML Label newGameGenre;
	@FXML Label newGameReleaseDate;
	@FXML Label editGameSystem;
	@FXML Label newGameOS;
	@FXML Label newGameCS;
	@FXML TextField newGameInputTitle;
	@FXML ComboBox<Genre> newGameInputGenre;
	@FXML TextField newGameInputReleaseDate;
	@FXML RadioButton newGameSystemInputConsole;
	@FXML RadioButton newGameSystemInputPC;
	@FXML Button newGameEnter;
	@FXML Button newGameQuit;

	@FXML public void newGameQuit(ActionEvent event) throws IOException {
		
		Scene oldScene = newGameQuit.getScene();
		Stage stage = (Stage) oldScene.getWindow();

		Parent root = FXMLLoader.load(getClass().getResource("ViewMyGames.fxml"));
		Scene scene = new Scene(root);
		stage.setTitle("Meine Spiele");
		stage.setScene(scene);
		stage.show();
		
	}

	@FXML public void newGameEnter(ActionEvent event) {}
	
	
	
	
}
