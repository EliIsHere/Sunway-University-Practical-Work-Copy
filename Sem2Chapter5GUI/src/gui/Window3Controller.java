package gui;

import controller.Database;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Student;
import javafx.scene.control.cell.PropertyValueFactory;

public class Window3Controller {

	@FXML
	private TableColumn<Student, Integer> tcAge;

	@FXML
	private TableColumn<Student, String> tcGender;

	@FXML
	private TableColumn<Student, String> tcName;

	@FXML
	private TableColumn<Student, Integer> tcNo;

	@FXML
	private TableView<Student> tvStudent;

	public void initialize() {
		Database db;
		Student arr[];
		Student stud;
		//link table column with the instance variable in the StudentTable
		tcNo.setCellValueFactory(new PropertyValueFactory<>("no"));
		tcName.setCellValueFactory(new PropertyValueFactory<>("name"));
		tcAge.setCellValueFactory(new PropertyValueFactory<>("age"));
		tcGender.setCellValueFactory(new PropertyValueFactory<>("gender"));

		try {
			db = new Database();
			arr = db.getAllRecords();
			if (arr==null) {
				DisplayAlert.display("database is empty", "Error retrieveing record", AlertType.ERROR);
				return;
			}
			for (int cnt=0;cnt<arr.length; cnt++) {
				stud = new Student(arr[cnt].getName(),
						arr[cnt].getAge(), arr[cnt].getGender());
				tvStudent.getItems().add(stud);
			}
		} catch (Exception ex) {
			DisplayAlert.display("Error connecting to database","Error retrieving record", AlertType.ERROR);
		}

	}

}
