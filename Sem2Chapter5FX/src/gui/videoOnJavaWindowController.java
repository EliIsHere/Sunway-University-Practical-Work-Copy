package gui;

import java.net.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.media.*;
import javafx.util.Duration;

public class videoOnJavaWindowController {

    @FXML
    private ImageView mediaimage;

    @FXML
    private MediaView mediavideo;
    MediaPlayer player;
    
    public void initialize() {
    	URL url=null;
    	Media media = null;
    	
    	url = getClass().getResource("../ImageAndVideo/neuviOtterVid.mp4");
    	media = new Media(url.toString());
    	player = new MediaPlayer(media);
    	mediavideo.setMediaPlayer(player);
    }

    @FXML
    private Button pausebt;

    @FXML
    private Button playbt;

    @FXML
    private Button rewindbt;

    @FXML
    private Button stopbt;

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
    	player.seek(Duration.ZERO);
    	player.play();
    }

    @FXML
    void stop(ActionEvent event) {
    	player.stop();
    }

}
