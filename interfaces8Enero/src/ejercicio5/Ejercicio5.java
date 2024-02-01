package ejercicio5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Ejercicio5 extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Boton1y2.fxml"));

		primaryStage.setTitle("Ejercicio Botones");
		primaryStage.setScene(new Scene(root, 230, 120));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
