package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;

public class MainWindow extends Application{
	FXMLLoader loader = null;
	Scene scene = null;


	@Override
	public void start(Stage stage) throws Exception {

		try {
			//load the fxml file
			loader = new FXMLLoader(this.getClass().getResource("Window2.fxml"));

			//set the fxml to the scene
			scene = new Scene(loader.load());

			//set stage's title
			stage.setTitle("Window 1");


			//add scene to the stage
			stage.setScene(scene);

			//display the stage
			stage.show();
		}catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
