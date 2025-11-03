package gui;

import java.lang.Math;
import controller.DatabasePractical2;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import model.MathQuizQuestions;
import javafx.scene.Node;

public class Practical2WindowController {
	Stage stage;
	MathQuizQuestions mqq = new MathQuizQuestions();
	Alert alert = null;
	DatabasePractical2 data = null;

	@FXML
	private TextField ansTF;

	@FXML
	private Label ansValidLabel;

	@FXML
	private Button leaveBT;

	@FXML
	private Button nextBT;

	@FXML
	private Label setQLabel;

	@FXML
	void ans(ActionEvent event) {
		double correctAns = 0;


		mqq.setAns(ansTF.getText());//read answer

		//if invalid input
		if (mqq.getAns()=="false") {
			alert = new Alert(AlertType.INFORMATION, "Wrong input. Do input a number as an answer", ButtonType.OK);
			alert.setTitle("Wrong Input Type");
			alert.show();
			ansValidLabel.setText("Your answer input type is invalid.");
		
		}else {
			try {
				//find the correct answer in database
				correctAns = data.retrieveA(mqq.getQuestionNo());

				//if user answer is correct
				if (correctAns==Double.parseDouble(mqq.getAns())) {
					ansValidLabel.setText("Your answer is correct");

					//if user answer is incorrect
				}else if (correctAns!=Double.parseDouble(mqq.getAns())) {
					ansValidLabel.setText("Your answer is incorrect.");
				}

				//if error in getting answer
			} catch (Exception e) {
				alert = new Alert(AlertType.ERROR, "Error in retrieving answer", ButtonType.OK);
				alert.setTitle("Error message");
				alert.show();
			}
		}
	}


	public void initialize() {

		try {
			data =  new DatabasePractical2();

			//generate random question number
			mqq.setQuestionNo((int) Math.floor(Math.random() *(10 - 1 + 1) + 1));

			//get question based on number
			mqq.setQuestion(data.retrieveQ(mqq.getQuestionNo()));

			//set label with question
			setQLabel.setText(mqq.getQuestion());

			//if error in producing question or question number
		}catch(Exception ex) {
			alert = new Alert(AlertType.ERROR, "Error in producing question", ButtonType.OK);
			alert.setTitle("Error message");
			alert.show();
		}

	}

	@FXML
	void leave(ActionEvent event) {//close interface
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		stage.close();
	}

	@FXML
	void next(ActionEvent event) {
		try {
			data =  new DatabasePractical2();

			//generate random question number
			mqq.setQuestionNo((int) Math.floor(Math.random() *(10 - 1 + 1) + 1));

			//get question based on number
			mqq.setQuestion(data.retrieveQ(mqq.getQuestionNo()));

			//set label with question
			setQLabel.setText(mqq.getQuestion());

			//if error in producing question or question number
		}catch(Exception ex) {
			alert = new Alert(AlertType.ERROR, "Error in producing question", ButtonType.OK);
			alert.setTitle("Error message");
			alert.show();
		}

		//clear valid answer label and answer in text field
		ansValidLabel.setText(null);
		ansTF.setText(null);
	}

}
