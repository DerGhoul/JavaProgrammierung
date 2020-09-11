package leistung;


import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.text.html.Option;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TableCell;
import javafx.scene.control.Menu;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.util.Callback;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ObservableValue;
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
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * Spalte "ausgewählt": Aussehen/Art der Zelle (Kontrollkästchen)	 * 	
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		isPlayedColumn.setCellFactory(new Callback<TableColumn<Option,Boolean>, TableCell<Option,Boolean>>() {
			public TableCell<Option, Boolean> call(TableColumn<Option, Boolean> param) {
				CheckBoxTableCell<Option, Boolean> cell = new CheckBoxTableCell<>();
				return cell;
			}
		});
		
		isPlayedColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Option,Boolean>, ObservableValue<Boolean>>() {
			public ObservableValue<Boolean> call(CellDataFeatures<Option, Boolean> param) {
				SimpleBooleanProperty booleanProperty = new SimpleBooleanProperty(param.getValue().isSelected());
				return null;
			}
		});
					
	}




	@FXML public void deleteSelectedGame(ActionEvent event) {}




	@FXML public void createNewGame(ActionEvent event) {}

	 
	
	
	
	
	
	
	
	
	
	
	
	
	
}
