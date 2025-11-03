package gui;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

public class MainWindow3 extends Application {
	FXMLLoader loader=null;
	Scene scene = null;

	@Override
	public void start(Stage stage) throws Exception {
		display("Window3.fxml", "Window 1", stage);
	}

	public  void display (String file, String title, Stage stage) {
		try {
			if (stage == null)
				stage = new Stage();
			//load the fxml file
			loader =  new FXMLLoader(this.getClass().getResource(file));

			//set stage's title
			stage.setTitle(title);
			//set the fxml to the scene
			scene = new Scene(loader.load());
			//add scene to the stage
			stage.setScene(scene);
			//display the stage
			stage.show();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch();
	}

}