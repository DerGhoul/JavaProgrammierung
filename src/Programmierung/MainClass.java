package Programmierung;



import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.*;
import javafx.fxml.FXMLLoader;

public class MainClass extends Application {
	

	
	public static void main(String[] args) {
		launch(args);		
	}
	
	public void init() {
		System.out.println("init()");
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		System.out.println("start()");
		Parent root = FXMLLoader.load(getClass().getResource("view.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("Übertragung");
		primaryStage.setHeight(200);
		primaryStage.setWidth(500);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public void stop() {
		System.out.println("stop()");
	}
	
		
}
	
	
	

