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
	@FXML java.awt.TextField newGameInputTitle;
	@FXML ComboBox<Genre> newGameInputGenre;
	@FXML TextField newGameInputReleaseDate;
	@FXML RadioButton newGameSystemInputConsole;
	@FXML RadioButton newGameSystemInputPC;
	@FXML Button newGameEnter;
	@FXML Button newGameQuit;

	@FXML public void newGameQuit(ActionEvent event) throws IOException {
		
		/*
		 * Der Szenenwechsel nach Bet�tigung des Abbruch Knopfes
		 */
		Scene oldScene = newGameQuit.getScene();
		Stage stage = (Stage) oldScene.getWindow();

		Parent root = FXMLLoader.load(getClass().getResource("ViewMyGames.fxml"));
		Scene scene = new Scene(root);
		stage.setTitle("Meine Spiele");
		stage.setScene(scene);
		stage.show();
		
	}

	@FXML public void newGameEnter(ActionEvent event) throws IOException  {
		
		Model m = Model.getInstance();
		m.setTitle(newGameInputTitle.getText());
		m.setGenre(newGameInputGenre.getTypeSelector());
		m.setYearofRelease(newGameInputReleaseDate.getText());
		m.setPlayedThrough(editGameFinishedInput.isSelected());
		if (newGameInputConsole.isSelected() == true) {
			m.setSystem(newGameInputConsoleSystem.getText());
		}
		else {
			m.setSystem(newGameInputOperatingSystem.getText);
		}
		
		/*
		 * Der Szenenwechsel nach Best�tigung der Eingabe
		 */
		Scene oldScene = newGameEnter.getScene();
		Stage stage = (Stage) oldScene.getWindow();

		Parent root = FXMLLoader.load(getClass().getResource("ViewMyGames.fxml"));
		Scene scene = new Scene(root);
		stage.setTitle("Meine Spiele");
		stage.setScene(scene);
		stage.show();
		
	}
	
	
	
	
}
