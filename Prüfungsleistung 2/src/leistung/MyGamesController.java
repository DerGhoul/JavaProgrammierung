package leistung;


import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
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
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class MyGamesController implements Initializable {

	@FXML MenuBar menuBar;
	@FXML MenuItem saveGames;
	@FXML Menu menue;
	@FXML MenuItem deleteAllGames;
	@FXML TableView<Option> gameTable;
	@FXML TableColumn<Option, String> 	titleColumn;
	@FXML TableColumn<Option, String> 	genreColumn;
	@FXML TableColumn<Option, String> 	yearColumn;
	@FXML TableColumn<Option, String> 	systemColumn;
	@FXML TableColumn<Option, Boolean> 	isPlayedColumn;
	@FXML Button newGame;
	@FXML Button deleteGame;
	@FXML CheckMenuItem check;
	@FXML CheckMenuItem editableCheckMenuItem;
	
	Writer writer = new Writer();


	
	
	
	
	
	
	
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
				SimpleBooleanProperty booleanProperty = new SimpleBooleanProperty(param.getValue().isPlayed);
				return booleanProperty;
			}
		});
			
		Model m = Model.getInstance();
		Writer writer = new Writer();
		
		if (m.gettableViewItems() != null) {
			writer.read();
			ArrayList<String> tableViewItems = Model.getInstance().gettableViewItems();
			for (String string : tableViewItems) {
				String[] tokens = string.split(";");
				m.setTitle(tokens[0]);
				m.setGenre(tokens[1]);
				m.setYearofRelease(tokens[2]);
				m.setSystem(tokens[3]);
				Boolean b;
				if (tokens[4] == "true") {
					b = true;
				}
				else {
					b = false;
				}
				m.setPlayedThrough(b);
			}
			setGames(tableViewItems);
		}
		
		
		
		
	}


	public void setGames(List<String> tableViewItems) {
		Model m = Model.getInstance();
			
		String title = m.getTitle();
		String genre = m.getGenre();
		String year = m.getYearofRelease();
		String system = m.getSystem();
		boolean isPlayed = m.getPlayedThrough();
		
		
		
		Option option = new Option(title,genre,year,system,isPlayed);
		gameTable.getItems().add(option);
		}
		
	


	@FXML public void deleteSelectedGame(ActionEvent event) {
		
	}




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




	@FXML public void deleteGames(ActionEvent event) {}




	@FXML public void saveGames(ActionEvent event) {
		
	}
		
		
	}

	 
	
	
	
	
	
	
	
	
	
	
	
	
	

