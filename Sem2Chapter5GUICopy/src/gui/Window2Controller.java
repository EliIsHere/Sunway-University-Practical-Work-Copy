package gui;

import controller.Database;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import model.Student;

public class Window2Controller {

    @FXML
    private ComboBox<Integer> cbAge;

    @FXML
    private RadioButton rbFemale;

    @FXML
    private RadioButton rbMale;

    @FXML
    private ToggleGroup gender;

    @FXML
    private TextField tfName;

    public void initialize () {
    	for (int cnt=20; cnt<=35; cnt++)
    		cbAge.getItems().add(cnt);
    }
    @FXML
    void add(ActionEvent event) {
    	String name="";
    	int age=0;
    	String gender="";
    	Student stud = null;
    	Database db;
    	boolean success = false;
    //	Alert alert = null;
    	
    	name=tfName.getText();
    	age = cbAge.getValue();
    	gender = (rbFemale.isSelected())? "Female":"Male";
    	
    	stud= new Student(name,age,gender);
    	String msg = "";
    	
    	try {
    		db = new Database();
    		success = db.insertRecord(stud);
    		if (success) {
    			msg = "A new student is added successfully";
    		} else {
    			msg = "adding a new student is not successful";
    		}	
    		//alert = new Alert(AlertType.INFORMATION, msg, ButtonType.OK);
    		//alert.setTitle("Add new student");
    		//alert.show();  
    		DisplayAlert.display(msg, "Add New Student", AlertType.INFORMATION);
    	} catch (Exception ex) {
    		//alert = new Alert(AlertType.ERROR, "Error connecting to database", ButtonType.OK);
    		//alert.setTitle("Error message");
    		//alert.show();
    		DisplayAlert.display(msg, "Error connecting to database", AlertType.ERROR);
    	}
    	
    	
    }

    @FXML
    void cancel(ActionEvent event) {
    	Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();  
    	new MainWindow().display("Window1.fxml", "Window 1", stage);
    }

}