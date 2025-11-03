package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;
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
    	new MainWindow3().display("Window2.fxml", "Window 2", stage);
    }

}