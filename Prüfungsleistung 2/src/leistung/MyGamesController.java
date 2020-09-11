package leistung;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.text.html.Option;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TableCell;
import javafx.scene.control.Menu;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioMenuItem;

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
	@FXML CheckMenuItem editableCheckMenuItem;
	@FXML RadioMenuItem noConversionRadioMenuItem;
	@FXML RadioMenuItem toLowerCaseConversionRadioMenuItem;
	@FXML RadioMenuItem toUpperCaseConversionRadioMenuItem;
	
	
	
	
	
	
	
	
	
	
	
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
				return booleanProperty;
			}
		});
					
	}




	@FXML public void deleteSelectedGame(ActionEvent event) {}




	@FXML public void createNewGame(ActionEvent event) throws IOException {
		
		/*
		 * Szenenwechsel von MyGames auf NewGame auf betätigen des Knopfes
		 */
		Scene oldScene = newGame.getScene();
		Stage stage = (Stage) oldScene.getWindow();

		Parent root = FXMLLoader.load(getClass().getResource("ViewNewGame.fxml"));
		Scene scene = new Scene(root);
		stage.setTitle("Neues Spiel anlegen");
		stage.setScene(scene);
		stage.show();
		
	}

	 
	
	
	
	
	
	
	
	
	
	
	
	
	
}
