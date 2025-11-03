package gui;

import controller.Database;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import model.*;

public class Window3Controller {

	@FXML
	private TableColumn<StudentTable, Integer> tcAge;

	@FXML
	private TableColumn<StudentTable, String> tcGender;

	@FXML
	private TableColumn<StudentTable, Integer> tcNo;

	@FXML
	private TableColumn<StudentTable, String> tcname;

	@FXML
	private TableView<StudentTable> tvStudent;


	public void initialize() {
		Database db;
		Student [] arr;
		StudentTable stud;

		//link table column with the instance variable in the StudentTable
		tcNo.setCellValueFactory(new PropertyValueFactory<>("no"));
		tcname.setCellValueFactory(new PropertyValueFactory<>("name"));
		tcAge.setCellValueFactory(new PropertyValueFactory<>("age"));
		tcGender.setCellValueFactory(new PropertyValueFactory<>("gender"));


		try {
			db = new Database();
			arr =db.getAllRecords();

			if (arr==null) {
				DisplayAlert.display("database is empty", "Error retrieving record", AlertType.ERROR);
				return;
			}
			
			for (int cnt=0; cnt<arr.length;cnt++) {
				stud = new StudentTable(cnt+1, arr[cnt].getName(),
						arr[cnt].getAge(), arr[cnt].getGender());
				tvStudent.getItems().add(stud);
			}
		} catch (Exception ex){
			DisplayAlert.display("database is empty", "Error retrieving record", AlertType.ERROR);
		}

	}

}
