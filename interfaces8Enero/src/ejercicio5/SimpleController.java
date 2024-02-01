package ejercicio5;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

public class SimpleController {
	
	@FXML
	private Button boton1, boton2, boton3, boton4;
	
	@FXML
	private void handleButtonclick(ActionEvent event) {
		String idBotonPulsado = ((Button) event.getSource()).getId();

		
		switch(idBotonPulsado){
		case "Pulsame1":
			System.out.println("Has pulsado el boton 1");
			break;
		case "Pulsame2":
			System.out.println("Has pulsado el boton 2");
			break;
		case "Pulsame3":
			System.out.println("Has pulsado el boton 3");
			break;
		case "Pulsame4":
			System.out.println("Has pulsado el boton 4");
			break;
		default:
			System.out.println("Botón no reconocido");
			break;
		}
	}
	
	
	

}
