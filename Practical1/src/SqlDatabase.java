import java.sql.*;
public class SqlDatabase {
	Statement stmt;

	public void StaffDatabase() throws Exception{
		//connect to the database,
		String address = "jdbc:mysql://localhost:3306/mysql";
		String username = "root";
		String password = "";

		Connection connect = DriverManager.getConnection(address, username, password);

		//create a statement object
		stmt = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

	}
	
	public String InsertStaffRecord(String name, int age, String position, char gender) throws Exception {//insert staff record
		String successOfInput = "";
		String sql = "SELECT * FROM staff WHERE name = '"+name+"'";//finds similar name in database
		ResultSet records = stmt.executeQuery(sql);

		boolean positionValidity = position.matches("^[A-Za-z ]*$");//checks if position only contains alphabets and spaces

		if (records.next()) {//if found similar name to name inputed

			return successOfInput = "Name inputted (" + name + ") already exist in database and thus is not valid. \nPlease re-enter staff input. ";

		}else if (age < 18 || age >55) {//if age is not in valid range

			return successOfInput = "Age inputted (" + age + ") is not valid (Must be between 18 and 55). \nPlease re-enter staff input. ";

		}else if (positionValidity!=true) {//if contains values that are not alphabets or spaces

			return successOfInput = "Position inputted (" + position + ") is not valid (Must only contain aphabets or spaces). \nPlease re-enter staff input. ";

		}else if (gender!='m' && gender!='f') {//if not f or m

			return successOfInput = "Gender inputted (" + gender + ") is not valid (Must be either small letter m or f). \nPlease re-enter staff input. ";

		} else {//if pass validation, add data into database and informs of success of inputting the data
			sql = String.format("INSERT INTO `staff`(`name`, `age`, `position`, `gender`) VALUES ('%s','%d', '%s', '%s')", name, age, position, gender);
			stmt.executeUpdate(sql); 

			return successOfInput = "Staff information has been successfully inputted into the database. ";
		}

	}


	public String FindDataToDelete(String name) throws Exception {//find if data exist (to delete it)
		String dataFound;
		//finds data containing same name
		String sql = "SELECT * FROM staff WHERE name = '"+name+"'";
		ResultSet records = stmt.executeQuery(sql);

		if (records.next()) {//if found data
			String temp = records.getString("name") + "," + records.getInt("age") + "," + records.getString("position") + "," + records.getString("gender");
			return dataFound = "The data you want to delete is found. ("+temp+")";
		
		} else {//if can't find data
			return dataFound = "Data does not exist in the database. \nPlease type in another name. ";
		}
	}

	public String DataToDelete(String name) throws Exception {//delete data
		String successOfDeletion = "Data selected has been deleted";
		//delete data from database
		String sql = "DELETE FROM `staff` WHERE name = '" + name + "'";
		int num = stmt.executeUpdate(sql);

		if (num == 1) {//if deletion is a success
			return successOfDeletion;
			
		}else {//if encountered error during deletion
			successOfDeletion = "Encountered error during deletion";
			return successOfDeletion;
		}



	}

	//Method block for viewing all staff records	
	public String[] ViewAllRecords() throws Exception {
		int number = 0, count = 0;
		//select all data from database
		String sql = "SELECT * FROM staff";
		ResultSet records = stmt.executeQuery(sql);
		String staff[] = null;
		
		//Finds number of data in database 
		if (records.next()) {
			records.last();
			number = records.getRow();
			records.beforeFirst();		
		}
		
		//create array to temporary store data
		staff = new String[number];
		
		//store data into array
		while (records.next()) {
			String temp = records.getString("name") + "," + records.getInt("age") + "," + records.getString("position") + "," + records.getString("gender");

			staff[count] = temp;
			count++;
		}
		return staff;


	}

}
