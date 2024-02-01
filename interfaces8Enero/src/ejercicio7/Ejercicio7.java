package ejercicio7;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Ejercicio7 extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("botones_ejer_7.fxml"));

		primaryStage.setTitle("Ejercicio 7");
		primaryStage.setScene(new Scene(root, 600, 500));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}