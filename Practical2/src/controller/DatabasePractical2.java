package controller;
import java.sql.*;

import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class DatabasePractical2 {
	Statement stmt=null;
	String sql=null;
	int row = 0;
	public DatabasePractical2 () throws Exception {
		Alert alert = null;

		//step 1  connect to database
		String addr="jdbc:mysql://localhost:3306/practical2";
		String user="root";
		String pword="";
		Connection connect = DriverManager.getConnection(addr, user, pword);
		if (connect !=null) {//if connect do nothing
			;
		}else {//if didn't connect
			alert = new Alert(AlertType.ERROR, "Error in connecting to database", ButtonType.OK);
			alert.setTitle("Error message");
			alert.show();
		}
		//step 2   create a statement object
		stmt = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	}

	//retrieve question based on question number generated
	public String retrieveQ(int questionNo) throws Exception{

		sql = "SELECT `Question` FROM `mathquiz` WHERE `No.` = '" + questionNo + "'";
		ResultSet question  = stmt.executeQuery(sql);

		if (question.next()) {//if found data
			String temp = question.getString("Question");
			return temp;

		} else {//if can't find data
			return null;
		}
	}

	//retrieve answer based on question number generated
	public double retrieveA(int questionNo) throws Exception{

		sql = "SELECT `Answer` FROM `mathquiz` WHERE `No.` = '" + questionNo + "'";
		ResultSet question  = stmt.executeQuery(sql);

		if (question.next()) {//if found data
			double temp = (double)question.getInt("Answer");
			return temp;

		} else {//if can't find data
			return 0;
		}
	}
}