import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;


//run configurations -> argument ->gyguihu
public class FirstWindow extends Application{

	@Override//right-click -> source -> Override/Implement Methods...
	public void start(Stage stage) throws Exception {
		Image img = null;
		ImageView iv = null;
		FlowPane flow = null;
		Scene scene = null;
		
		//create an Image class object
		img = new Image("image/otter.jpg");
		//create an ImageView object
		iv = new ImageView(img);
		//create a FlowPanel object (Layout manager)
		flow = new FlowPane();
		//add image view into the flow Pnael
		flow.getChildren().add(iv);
		//add flowPanel to scene
		scene = new Scene(flow,501,600);
		//add the scene into the stage
		stage.setScene(scene);
		
		stage.setTitle("JavaFX Window");//Title of Window
		
		stage.show();//put as last stmt
	}
	
	public static void main(String[] args) {
		launch();
	}
}
