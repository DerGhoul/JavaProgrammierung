package leistung;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;

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
	
	

}
