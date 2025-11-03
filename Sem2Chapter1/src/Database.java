import java.sql.*;
public class Database {//back end (step 1,2 will be here
	Statement stmt;

	public Database() throws Exception{
		//step 1: connect to the database, mydatabase
		String address = "jdbc:mysql://localhost:3306/mydatabase";
		String username = "root";
		String password = "";

		Connection connect = DriverManager.getConnection(address, username, password);

		if(connect!=null)
			System.out.println("connected");
		else
			System.out.println("error");

		//step 2: create a statement object
		stmt = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE/*Allows you to read code in database*/, ResultSet.CONCUR_READ_ONLY);
	}

	public String[] getAllRecords() throws Exception {
		String stud[] = null;
		int number = 0, count = 0;
		
		//step 3: execute query		//select
		String sql = "select * from student";//retrieve everything from database
		ResultSet result = stmt.executeQuery(sql);

		//step 4: process result		//moving pointer to find array size
		if (result.next()) {
			result.last();
			number = result.getRow();
			result.beforeFirst();		//reset pointer back to first element
		}
		
		//instantiate stud array
		stud = new String[number];
		
		while (result.next()) {
			String temp = result.getString("name") + "," + result.getInt("age") + "," + result.getString("gender");
			
			stud[count] = temp;
			count++;
		}
		return stud;

	}
}

