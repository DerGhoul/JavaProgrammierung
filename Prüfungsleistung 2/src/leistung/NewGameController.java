package leistung;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.ComboBoxListCell;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ComboBoxBase;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import java.awt.List;
import java.io.IOException;
import java.net.URL;

import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

public class NewGameController implements Initializable {

	@FXML Label newGameTitle;
	@FXML Label newGameGenre;
	@FXML Label newGameReleaseDate;
	@FXML Label newGameSystem;
	@FXML Label newGameOS;
	@FXML Label newGameCS;
	@FXML TextField newGameInputTitle;
	@FXML ComboBox<String> newGameInputGenre;
	@FXML TextField newGameInputReleaseDate;
	@FXML RadioButton newGameSystemInputConsole;
	@FXML RadioButton newGameSystemInputPC;
	@FXML RadioButton newGameSystemInputMG;
	@FXML ComboBox<String> newGameInputRS;
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
		model.setTitle(newGameInputTitle.getText());
		isCorrect = true;
		}catch (Exception e) {
			alert.setContentText("Bitte eine Zeichenkette als Titel eingeben");
			alert.setHeaderText("Ungültige Eingabe");
			alert.showAndWait();
			isCorrect = false;
		}
		
		
		
		try {
			model.setYearofRelease(newGameInputReleaseDate.getText());
			isCorrect=true;
		} catch (Exception e) {
			alert.setContentText("Bitte eine Zahl als Erscheinungsjahr eingeben");
			alert.setHeaderText("Ungültige Eingabe");
			alert.showAndWait();
			isCorrect = false;
		}
		
			
		/*
		* Szenenwechsel nach Betätigung des Hinzufügenknopfes
		*/
		if(isCorrect == true) {
		Scene oldScene = newGameEnter.getScene();
		Stage stage = (Stage) oldScene.getWindow();

		Parent root = FXMLLoader.load(getClass().getResource("ViewMyGames.fxml"));
		Scene scene = new Scene(root);
		stage.setTitle("Meine Spiele");
		stage.setScene(scene);
		stage.show();
		}
		
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
	
	
	@FXML public void newGameSystemInputPCSelected(ActionEvent event) {
		if (newGameSystemInputMG.isSelected() == true) {
			newGameSystemInputMG.setSelected(false);
			newGameOS.setVisible(false);
			newGameCS.setVisible(true);
		}
		if(newGameSystemInputConsole.isSelected() == true) {
			newGameSystemInputConsole.setSelected(false);
			newGameCS.setVisible(false);
			newGameOS.setVisible(true);
		}
	}

	@FXML public void newGameSystemInputMGSelected() {
		if (newGameSystemInputPC.isSelected() == true) {
			newGameSystemInputPC.setSelected(false);
			newGameOS.setVisible(true);
			newGameCS.setVisible(false);
		}
		if(newGameSystemInputConsole.isSelected() == true) {
			newGameSystemInputConsole.setSelected(false);
			newGameOS.setVisible(false);
			newGameCS.setVisible(true);
		}
	}

	@FXML public void newGameSystemInputConsoleSelected(ActionEvent event) {
		if (newGameSystemInputPC.isSelected() == true) {
			newGameSystemInputPC.setSelected(false);
		}
		if(newGameSystemInputMG.isSelected() == true) {
			newGameSystemInputMG.setSelected(false);
			
			
			
		}
	}

	@SuppressWarnings("null")
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ObservableList<ComboBoxListCell<String>> cls = null;
		
		
		ComboBoxListCell<String> genre1 = new ComboBoxListCell<>();
		genre1.setText("Action");cls.add(genre1);
		ComboBoxListCell<String> genre2 = new ComboBoxListCell<>();
		genre1.setText("ActionAdventure");cls.add(genre2);
		ComboBoxListCell<String> genre3 = new ComboBoxListCell<>();
		genre1.setText("RPG");cls.add(genre3);
		ComboBoxListCell<String> genre4 = new ComboBoxListCell<>();
		genre1.setText("Sport");cls.add(genre4);
		ComboBoxListCell<String> genre5 = new ComboBoxListCell<>();
		genre1.setText("Strategy");cls.add(genre5);
		ComboBoxListCell<String> genre6 = new ComboBoxListCell<>();
		genre1.setText("Simulation");cls.add(genre6);
		
		
		
		newGameInputGenre.getChildrenUnmodifiable().addAll(cls);
		
		
		ObservableList<ComboBoxListCell<String>> grs = null;
		
		
		ComboBoxListCell<String> inputrs1 = new ComboBoxListCell<>();
		inputrs1.setText("MS_Windows");grs.add(inputrs1);
		ComboBoxListCell<String> inputrs2 = new ComboBoxListCell<>();
		inputrs1.setText("MacOS");grs.add(inputrs2);
		ComboBoxListCell<String> inputrs3 = new ComboBoxListCell<>();
		inputrs1.setText("Linux");grs.add(inputrs3);
		ComboBoxListCell<String> inputrs4 = new ComboBoxListCell<>();
		inputrs1.setText("IOS");grs.add(inputrs4);
		ComboBoxListCell<String> inputrs5 = new ComboBoxListCell<>();
		inputrs1.setText("Android");grs.add(inputrs5);
		ComboBoxListCell<String> inputrs6 = new ComboBoxListCell<>();
		inputrs1.setText("PS4");grs.add(inputrs6);
		ComboBoxListCell<String> inputrs7 = new ComboBoxListCell<>();
		inputrs1.setText("XBOXONE");grs.add(inputrs7);
		ComboBoxListCell<String> inputrs8 = new ComboBoxListCell<>();
		inputrs1.setText("Switch");grs.add(inputrs8);
		
		
		
		newGameInputRS.getChildrenUnmodifiable().addAll(grs);
	}
	
	
	
	
	

}
