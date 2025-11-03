import java.sql.*;
public class CheckedException {
	//public static void main(String[] args) throws Exception/*very bad habit*/ {
	public static void main(String[] args){
		Connection connect = null;
		try {
			connect = DriverManager.getConnection("","","");
		}catch(SQLException ex) {
			System.out.println("error connecting to database");
		}

		//connect = DriverManager.getConnection("","","");//checked exception => without try-catch, it can't be compiled

		System.out.println(10/0);//unchecked exception
	}
}
