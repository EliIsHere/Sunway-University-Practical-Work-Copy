import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoanDatabase {
	Statement stmt=null;

	final String URL = "jdbc:mysql://localhost:3306/mydb";
	final String USER = "root";
	final String PWORD = "";

	Connection connect=null;

	public LoanDatabase() throws Exception {
		connect = DriverManager.getConnection(URL, USER, PWORD);
		stmt = connect.createStatement();
		System.out.println("Database connected");
	}

	public int getMaxId () throws Exception {
		int id=0;
		String sql = "select max(id) as idMax from loan ";
		ResultSet result = stmt.executeQuery(sql);
		if (result.next() ) {
			id = result.getInt("idMax");
		}	
		return ++id;
	}

	public boolean saveRecord (Loan loan )  throws Exception {
		int row=0;
		int id = getMaxId();
		String sql = String.format("insert into loan (id, amount, duration, mthlyPayment) values (%d, %f, %d, %f)", 
				id, loan.amt, loan.duration, loan.mthlyPayment);
		row = stmt.executeUpdate(sql);
		if (row ==1)
			return true;
		else
			return false;		
	}
	public Loan searchLoan (int id) throws Exception {
		String sql="select * from loan where id="+ id;
		Loan loan = null;
		ResultSet result=null;

		//retrieve loan record from database

		result = stmt.executeQuery(sql);
		if (result.next() ) {
			loan = retrieveLoan (result)  ;  //display loan record
		}
		return loan;
	}

	// display loan record on screen
	public Loan retrieveLoan (ResultSet result) throws Exception {
		Loan loan = new Loan(result.getInt("id"), 
				result.getDouble("amount"),
				result.getInt("duration"),
				result.getDouble("mthlyPayment"));
		return loan;
	}

	public boolean deleteARecord(int id) throws Exception {
		String sql = "delete from loan where id = "+ id;
		int row = stmt.executeUpdate(sql);
		if (row == 1)
			return true;						
		return false;
	}

	public Loan[] retrieveAll() throws Exception{	
		Loan arr[] = null;
		int rows=0;
		String sql  = "select * from loan order by id";
		ResultSet result = stmt.executeQuery(sql);

		//count number of rows from the result set
		if (result.next()) {
			result.last();
			rows = result.getRow();
			result.beforeFirst();
		}

		//instantiate the Staff array
		arr= new Loan[rows];
		rows=0;
		while (result.next()) {
			arr[rows] = retrieveLoan (result); 
			rows++;
		}
		return arr;
	}
}