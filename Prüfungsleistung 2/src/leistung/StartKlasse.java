package leistung;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartKlasse extends Application {
	
	/*
	 * Methode zum erstmaligen aufrufen der Meine Spiele Oberfl�che
	 */
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("ViewMyGames.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("Meine Spiele");
		primaryStage.setScene(scene);
		primaryStage.setHeight(500);
		primaryStage.setWidth(700);
		primaryStage.show();		
	}
}
