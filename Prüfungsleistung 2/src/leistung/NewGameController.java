package leistung;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import java.io.IOException;

import javafx.event.ActionEvent;

public class NewGameController {

	@FXML Label newGameTitle;
	@FXML Label newGameGenre;
	@FXML Label newGameReleaseDate;
	@FXML Label newGameSystem;
	@FXML Label newGameOS;
	@FXML Label newGameCS;
	@FXML TextField newGameInputTitle;
	@FXML ComboBox<Genre> newGameInputGenre;
	@FXML TextField newGameInputReleaseDate;
	@FXML RadioButton newGameSystemInputConsole;
	@FXML RadioButton newGameSystemInputPC;
	@FXML RadioButton newGameSystemInputMG;
	@FXML ComboBox<Genre> newGameInputRS;
	@FXML HBox buttonPart;
	@FXML Button newGameEnter;
	@FXML Button newGameQuit;
	Alert alert = new Alert(AlertType.WARNING);
	
	@FXML public void newGameEnter(ActionEvent event) throws IOException {
		
		Model model = Model.getInstance();
		boolean isCorrect = false;
		/*
		 * Speichern des Titels aus der Eingabe
		 */
		try {
		String inputStringTitle = newGameInputTitle.getText();
		model.setTitle(inputStringTitle);
		}catch (Exception e) {
			alert.setContentText("Bitte eine Zeichenkette als Titel eingeben");
			alert.setHeaderText("Ungültige Eingabe");
			alert.showAndWait();
			isCorrect = false;
		}
		
		try {
		String inputStringReleaseDate = newGameInputReleaseDate.getText();
		model.setReleaseDate(inputStringReleaseDate);
		} catch (Exception e) {
			alert.setContentText("Bitte eine Zahl als Erscheinungsjahr eingeben");
			alert.setHeaderText("Ungültige Eingabe");
			alert.showAndWait();
			isCorrect = false;
		}
		
			
		/*
		* Szenenwechsel nach Betätigung des Hinzufügenknopfes
		*/
		Scene oldScene = newGameEnter.getScene();
		Stage stage = (Stage) oldScene.getWindow();

		Parent root = FXMLLoader.load(getClass().getResource("ViewMyGames.fxml"));
		Scene scene = new Scene(root);
		stage.setTitle("Meine Spiele");
		stage.setScene(scene);
		stage.show();
		
	}

	/*
	 * Szenenwechsel nach Betätigung des Abbruchknopfes
	 */
	@FXML public void newGameQuit(ActionEvent event) throws IOException {
		
		Scene oldScene = newGameEnter.getScene();
		Stage stage = (Stage) oldScene.getWindow();

		Parent root = FXMLLoader.load(getClass().getResource("ViewMyGames.fxml"));
		Scene scene = new Scene(root);
		stage.setTitle("Meine Spiele");
		stage.setScene(scene);
		stage.show();
		
	}
	
	
	
	
	

}
