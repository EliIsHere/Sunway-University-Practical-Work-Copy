package gui;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;;

public class DisplayAlert {
	public static void display(String msg, String title, AlertType type) {
		Alert alert = new Alert(AlertType.INFORMATION, msg, ButtonType.OK);
		alert.setTitle(title);
		alert.show();
		
	}

}
