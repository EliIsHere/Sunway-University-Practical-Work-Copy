
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FirstWindow extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		Image img=null;
		ImageView iv = null;
		FlowPane flow=null;
		Scene scene=null;
		
	//	try {
		//create an Image class object
		img = new Image("image/cat.jpg");
		
		//create an ImageView object
		iv = new ImageView(img);
		
		//create a FlowPanel object (Layout manager)
		flow = new FlowPane();
		
		//add image view into the flowPanel 
		flow.getChildren().add(iv);
		
		//add flowPanel into the scene
		scene = new Scene(flow, 300,300);
		
		// add the scene into the stage
		stage.setScene(scene);
	
	//	}catch(Exception ex) {
		
		stage.setTitle("my first JavaFX window");
		stage.show();
	//	}
	}

	
	public static void main(String[] args) {
		launch();
	}
}