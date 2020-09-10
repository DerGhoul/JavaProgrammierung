package vorbereitung;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartKlasse extends Application {


	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("View1.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("Demo 2.10");
		primaryStage.setScene(scene);
		primaryStage.setHeight(500);
		primaryStage.setWidth(700);
		primaryStage.show();		
	}
}
	
