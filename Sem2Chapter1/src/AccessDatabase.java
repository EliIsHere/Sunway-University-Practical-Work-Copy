import java.sql.*;
public class AccessDatabase {
	public static void main(String[] args) throws Exception {//not advice to place all the steps into one method (separate steps 1,2 from 3,4)
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
		Statement stmt = connect.createStatement();
		
		//step 3: execute a sql
		String nm = "Betty";
		int age = 22;
		char gen ='F';
		
		//String sql = "INSERT INTO `student`(`name`, `age`, `gender`) VALUES ('Petunia','30','F')";
		String sql = String.format("INSERT INTO `student`(`name`, `age`, `gender`) VALUES ('%s','%d','%c')", nm, age, gen);
		int num = stmt.executeUpdate(sql);
		
		//step 4: process result
		if (num==1)
			System.out.println("1 record has been inserted successfully");
		else
			System.out.println("error inserting a record");
		
	}

}
