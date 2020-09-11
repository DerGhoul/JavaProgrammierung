package leistung;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.ComboBoxListCell;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class EditGameController implements Initializable {

	
	@FXML Label newGameTitle;
	@FXML CheckBox editGameFinishedInput;
	@FXML Label editGameGameFinished;
	@FXML Label newGameGenre;
	@FXML Label newGameReleaseDate;
	@FXML Label editGameSystem;
	@FXML Label newGameOS;
	@FXML Label newGameCS;

	@FXML TextField newGameInputTitle;
	@FXML TextField newGameInputReleaseDate;
	
	
	
	
	@FXML RadioButton newGameSystemInputMG;
	@FXML RadioButton newGameSystemInputConsole;
	@FXML RadioButton newGameSystemInputPC;
	
	
	
	
	@FXML Button newGameEnter;
	@FXML Button newGameQuit;
	@FXML ComboBox<String> newGameInputOperatingSystem;
	@FXML ComboBox<String> newGameInputConsoleSystem;
	@FXML ComboBox<String> newGameInputGenre;

	@FXML public void newGameQuit(ActionEvent event) throws IOException {
		
		/*
		 * Der Szenenwechsel nach Betätigung des Abbruch Knopfes
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
		if (newGameSystemInputConsole.isSelected() == true) {
			String a = newGameInputConsoleSystem.getValue();
			m.setSystem(a);
			newGameInputOperatingSystem.setVisible(false);				
			}
		if (newGameSystemInputPC.isSelected() == true) {
			String a = newGameInputOperatingSystem.getValue();
			m.setSystem(a);
			newGameInputConsoleSystem.setVisible(false);
		}
		if (newGameSystemInputMG.isSelected() == true) {
			String a = newGameInputOperatingSystem.getValue();
			m.setSystem(a);
			newGameInputConsoleSystem.setVisible(false);
		}
		Writer w = new Writer();
		w.write();
		/*
		 * Der Szenenwechsel nach Bestätigung der Eingabe
		 */
		Scene oldScene = newGameEnter.getScene();
		Stage stage = (Stage) oldScene.getWindow();

		Parent root = FXMLLoader.load(getClass().getResource("ViewMyGames.fxml"));
		Scene scene = new Scene(root);
		stage.setTitle("Meine Spiele");
		stage.setScene(scene);
		stage.show();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
		inputrs2.setText("MacOS");grs.add(inputrs2);
		ComboBoxListCell<String> inputrs3 = new ComboBoxListCell<>();
		inputrs3.setText("Linux");grs.add(inputrs3);
		ComboBoxListCell<String> inputrs4 = new ComboBoxListCell<>();
		inputrs4.setText("IOS");grs.add(inputrs4);
		ComboBoxListCell<String> inputrs5 = new ComboBoxListCell<>();
		inputrs5.setText("Android");grs.add(inputrs5);
		
		
	
		
		newGameInputOperatingSystem.getChildrenUnmodifiable().addAll(grs);
		
		ObservableList<ComboBoxListCell<String>> cs = null;
		
		ComboBoxListCell<String> inputrs6 = new ComboBoxListCell<>();
		inputrs6.setText("PS4");cs.add(inputrs6);
		ComboBoxListCell<String> inputrs7 = new ComboBoxListCell<>();
		inputrs7.setText("XBOXONE");cs.add(inputrs7);
		ComboBoxListCell<String> inputrs8 = new ComboBoxListCell<>();
		inputrs8.setText("Switch");cs.add(inputrs8);
		
		newGameInputConsoleSystem.getChildrenUnmodifiable().addAll(cs);
	}
	
	
	
	
}
