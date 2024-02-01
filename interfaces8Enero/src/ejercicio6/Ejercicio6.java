package ejercicio6;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Ejercicio6 extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("botones_ejer_6.fxml"));

		primaryStage.setTitle("Ejercicio 6");
		primaryStage.setScene(new Scene(root, 230, 120));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}