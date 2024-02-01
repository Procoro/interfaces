module interfaces8Enero {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
	opens ejercicio3 to javafx.graphics, javafx.fxml;
	opens ejercicio4 to javafx.graphics, javafx.fxml;
	opens ejercicio5 to javafx.graphics, javafx.fxml;
	opens ejercicio6 to javafx.graphics, javafx.fxml;
	opens ejercicio7 to javafx.graphics, javafx.fxml;
	opens ejercicio9 to javafx.graphics, javafx.fxml;
	opens ejercicio10 to javafx.graphics, javafx.fxml;
	opens ud5_ejer1 to javafx.graphics, javafx.fxml;
	
}
