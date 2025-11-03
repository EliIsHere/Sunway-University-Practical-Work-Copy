import java.util.*;
import java.sql.*;
public class LoanMainProgram {
		public static void main(String[] args) throws Exception {
			TestLoan tl = new TestLoan();
			tl.displayMenu();
		}

}
class TestLoan {
	Scanner scan=null;
	LoanDatabase db=null;
	Loan loan=null;
	
	public TestLoan () throws Exception {
		scan = new Scanner(System.in);
		db = new LoanDatabase();
	}

	public void displayMenu() throws Exception {
		int choice = 0;
		boolean success = false;
		do {
			System.out.println("Main Menu");
			System.out.println("1. Insert a new record");
			System.out.println("2. Delete a record");
			System.out.println("3. View all records");
			System.out.println("4. Exit");
			System.out.print("Enter your choice [1..4]: ");
			choice = scan.nextInt();
			System.out.println();
			switch (choice) {
			case 1: 
				loan = inputValues(); 
				success = db.saveRecord(loan);
				System.out.println(success? "record added sucessfully": "error occur while adding a record");
				break;
			case 2: 
				loan = searchLoan();
				if (loan != null) {
					success = deleteLoan(loan.id);
					System.out.println(success? "record deleted sucessfully": "error occur while deleting a record");
				} else 
					System.out.println("loan record does not exist");
				break;
			case 3: viewAll(); break;
			case 4: System.out.println("thank you for using the system. ");break;
			default: System.out.println("invalid input. please try again.");
			}
			System.out.println("\n\n");
		} while (choice !=4);
	}


	public Loan inputValues() {
		loan = null;
		double amt = 0, mthlyPayment = 0;
		int duration =0;
		//prompt user to enter loan amount, which need to be non-zero and positive
		do {
			System.out.print("enter loan amount: ");
			amt = scan.nextDouble();
			if(amt <=0 )
				System.out.println("invalid amount. please re-enter");
		} while (amt <= 0);
		//prompt user to enter loan duration, which need to be within 1-12
		do {
			System.out.print("enter loan duration [1-12] months: ");
			duration = scan.nextInt();
			if(duration <1 || duration > 12)
				System.out.println("invalid duration. please re-enter");
		} while (duration <1 || duration > 12);
		//prompt user to enter loan monthly payment, which need to be non-zero and positive
		do {
			System.out.print("enter monthly payment: ");
			mthlyPayment = scan.nextDouble();
			if(mthlyPayment <=0 )
				System.out.println("invalid payment amount. please re-enter");
			else if (mthlyPayment >amt)
				System.out.println("Monthly payment cannot greater than loan amount. please re-enter");
		} while (mthlyPayment <= 0);
		loan = new Loan (amt, duration, mthlyPayment);
		return loan;		
	}
	
	public Loan searchLoan () throws Exception {
		//initialise variables
		loan = null;
		int id = 0;
		//prompt user to enter loan id
		System.out.print("Enter loan id:");
		id = scan.nextInt();
		//retrieve loan record from database
		loan = db.searchLoan(id);
		if (loan!=null ) {
			System.out.println(loan); ;  //display loan record
		}
		return loan;
	}

	//delete record
	public boolean deleteLoan(int id) throws Exception {
		int confirm = 0;
		do {
			System.out.print("Are you sure to delete (1-yes, 2-no): ");
			confirm = scan.nextInt();
			if (confirm !=1 && confirm !=2)
				System.out.println("invalid value. please re-enter");
		} while  (confirm !=1 && confirm !=2);

		if (confirm==1) {
			return db.deleteARecord(id);					
		}	
		return false;
	}

	public void viewAll() throws Exception{		
		Loan[] loanArr = db.retrieveAll();
		if (loanArr !=null) {
			for (int cnt=0; cnt<40; cnt++)
				System.out.print("=");
		
			System.out.println();
			for (Loan temp:loanArr)
				System.out.println(temp);
		} else
			System.out.println("No record in the database");
	}
}

class Loan {
	int id;
	double amt;
	int duration;
	double mthlyPayment;
	public Loan(double amt, int duration, double mthlyPayment) {
		this.amt = amt;
		this.duration = duration;
		this.mthlyPayment = mthlyPayment;
	}
	public Loan(int id, double amt, int duration, double mthlyPayment) {
		this(amt, duration, mthlyPayment);
		this.id = id;		
	}
	@Override
	public String toString() {
		return String.format("%-5d %-8.2f %6d   %10.2f",id,amt, duration, mthlyPayment);
	}

}