import java.sql.*;
public class Database {
	final String URL = "jdbc:mysql://localhost:3306/mydb";
	final String USER = "root";
	final String PWORD = "";

	Statement stmt=null;
	String sql=null;
	int row = 0;

	public Database () throws Exception {
		Connection connect = DriverManager.getConnection(URL, USER, PWORD);
		stmt = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		System.out.println("Database connected");
	}

	public boolean isExistName(String name) throws Exception{
		sql = "select * from staff where name='" + name + "'";
		ResultSet result  = stmt.executeQuery(sql);
		return result.next();
	}
	public boolean saveRecord (Staff staff )  throws Exception {
		String sql = String.format("insert into staff (name, age, position, gender) values ('%s', %d, '%s', '%s')", 
				staff.name, staff.age, staff.position, staff.gender);
		row = stmt.executeUpdate(sql);
		if (row ==1)
			return true;
		else
			return false;		
	}

	
	//delete a record
	public boolean deleteARecord(String name) throws Exception {
		sql = "delete from staff where name = '"+ name +"'";
		row = stmt.executeUpdate(sql);
		if (row == 1)
			return true;						
		return false;
	}

	public Staff[] retrieveAll() throws Exception{
		int rows=0;
		Staff staff[] = null;
		ResultSet result = null;
		
		sql  = "select * from staff order by name";
		result = stmt.executeQuery(sql);

		//count number of rows from the result set
		if (result.next()) {
			result.last();
			rows = result.getRow();
			result.beforeFirst();
		}

		//instantiate the Staff array
		staff= new Staff[rows];
		rows=0;
		while (result.next()) {
			staff[rows] = printStaff (result); 
			rows++;
		}
		return staff;
	}

	// extract a staff record
	public Staff printStaff (ResultSet result) throws Exception {
		String snm=null, spos=null, sgender=null;
		int sage=0;
		Staff staff=null;

		if (result!=null) {
			snm = result.getString("name");
			sage = result.getInt("age");
			spos = result.getString("position");
			sgender =result.getString("gender");

			staff = new Staff(snm, sage, spos, sgender);			
		}
		return staff;
	}

}