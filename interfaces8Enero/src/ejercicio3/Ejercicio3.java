package ejercicio3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Ejercicio3 extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Pulsame.fxml"));

		primaryStage.setTitle("Ejercicio Simple");
		primaryStage.setScene(new Scene(root, 630, 400));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}