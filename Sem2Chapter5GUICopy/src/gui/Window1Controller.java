package gui;

import java.net.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.util.Duration;

public class Window1Controller {

    @FXML
    private Button bt1;

    @FXML
    private Button bt2;

    @FXML
    private Button bt3;

    @FXML
    private Button btWin2;

    @FXML
    private TextField tf1;
    

    @FXML
    void exeBt1(ActionEvent event) {
    	tf1.setText("value 1");
    }

    @FXML
    void exeBt2(ActionEvent event) {
    	tf1.setText("value 2");
    }

    @FXML
    void exeBt3(ActionEvent event) {
    	tf1.setText("value 3");

    }

    @FXML
    void exeToWindow2(ActionEvent event) {
    	Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();  //import javafx.scene.Node;
    	new MainWindow().display("Window2.fxml", "Window 2", stage);
    }
    
    
    
    
    @FXML
    private MediaView video;
    MediaPlayer player;
    
    public void initialize() {
    	URL url = null;
    	Media media = null; //add javafx.media into the configuration
    	
    	url = getClass().getResource("../video/video.mp4");
    	media = new Media(url.toString());
    	player = new MediaPlayer(media);
    	video.setMediaPlayer(player);
    }
    
    @FXML
    void pause(ActionEvent event) {
    	player.pause();
    }

    @FXML
    void play(ActionEvent event) {
    	player.play();
    }

    @FXML
    void rewind(ActionEvent event) {
    	player.seek(null);
    }

    @FXML
    void stop(ActionEvent event) {
    	player.stop();
    }


}