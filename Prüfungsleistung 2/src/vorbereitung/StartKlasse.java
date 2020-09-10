package vorbereitung;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartKlasse extends Application {
<<<<<<< HEAD

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("View1.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("Demo 2.10");
		primaryStage.setScene(scene);
		primaryStage.show();		
	}
	
=======
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("View1.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("Demo 2.10");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
>>>>>>> branch 'master' of https://github.com/DerGhoul1/JavaProgrammierung
}
