package leistung;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Menu;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class MyGamesController implements Initializable {

	@FXML MenuBar menuBar;
	@FXML Menu saveGames;
	@FXML Menu menue;
	@FXML CheckMenuItem check;
	@FXML Menu deleteAllGames;
	@FXML TableView<Option> gameTable;
	@FXML TableColumn<Option, Integer> 	titleColumn;
	@FXML TableColumn<Option, String> 	genreColumn;
	@FXML TableColumn<Option, String> 	yearColumn;
	@FXML TableColumn<Option, String> 	systemColumn;
	@FXML TableColumn<Option, Boolean> 	isPlayedColumn;
	@FXML Button newGame;
	@FXML Button deleteGame;
	
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}




	@FXML public void deleteSelectedGame(ActionEvent event) {}




	@FXML public void createNewGame(ActionEvent event) {}

	 
	
	
	
	
	
	
	
	
	
	
	
	
	
}
