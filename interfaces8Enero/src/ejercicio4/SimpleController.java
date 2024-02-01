package ejercicio4;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;

public class SimpleController {
	
	@FXML
	private void handleButtonclick(ActionEvent event) {
		System.out.println("Ha pulsado el botón");
	}
	
	@FXML
	private void pulsame(ActionEvent event) {
		System.out.println("Ha pulsado el botón");
	}
	

}
