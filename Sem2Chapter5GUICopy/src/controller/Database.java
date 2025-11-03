
package controller;
import java.sql.*;

import model.Student;

public class Database {
	Statement stmt;
	public Database () throws Exception {
		//step 1  connect to database
		String addr="jdbc:mysql://localhost:3306/mydatabase";
		String user="root";
		String pword="";
		Connection connect = DriverManager.getConnection(addr, user, pword);
		if (connect !=null)
			System.out.println("successfully connected to the database");
		else
			System.out.println("error connecting to the database");
		//step 2   create a statement object
		stmt = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	}

	public boolean insertRecord(Student stud) throws Exception{
		boolean success = true;
		String sql="";
		int result=0;
		//step 3: execute a sql statement
		sql=String.format("INSERT INTO `student`(`name`, `age`, `gender`) VALUES ('%s','%d','%s')",
				stud.getName(),stud.getAge(),stud.getGender());
		result = stmt.executeUpdate(sql);

		//step 4 process result
		return result==1;
	}

	public Student[] getAllRecords () throws Exception{
		Student arr[] = null;
		int row=0;
		Student stud=null;
		
		//step 3: execute a sql statement
		String sql = "SELECT * FROM `student` order by name";
		ResultSet result = stmt.executeQuery(sql);

		//CHECK RESULTSET SIZE
		if (result.next()) {
			result.last();
			arr = new Student[result.getRow()];
			result.beforeFirst();
		}
		
		//step 4 process result
		while(result.next()) {
			stud = new Student(result.getString("name"), result.getInt("age"), result.getString("gender").equals("m")?"Male":"Female");
			arr[row] = stud;
			row++;
		}
		return arr;
	}
	
	

}