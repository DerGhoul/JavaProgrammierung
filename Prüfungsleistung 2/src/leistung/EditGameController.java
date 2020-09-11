package leistung;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
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

	@FXML public void newGameQuit(ActionEvent event) {}

	@FXML public void newGameEnter(ActionEvent event) {}
	
	
	
	
}
