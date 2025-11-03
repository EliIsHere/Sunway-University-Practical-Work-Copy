import java.util.*;

public class MainProgram {
	public static void main(String[] args) throws Exception {
		TestStaff ts = new TestStaff();
		ts.displayMenu();
		//new TestStaff().displayMenu();
	}
}

class TestStaff{
	Scanner scan=null;
	Database db;

	public TestStaff () throws Exception{
		scan = new Scanner(System.in);	
		db = new Database();
	}

	public void displayMenu() throws Exception {
		int choice = 0;
		do {
			System.out.println("menu");
			System.out.println("1. Insert a new record");
			System.out.println("2. Delete a record");
			System.out.println("3. View all records");
			System.out.println("4. Exit");
			System.out.print("Enter your choice [1..4]: ");
			choice = scan.nextInt();
			scan.nextLine();
			System.out.println();
			
			switch (choice) {
			case 1: insertNewRecord(); break;
			case 2: deleteARecord(); break;
			case 3: viewAll(); break;
			case 4: System.out.println("thank you for using the system. ");break;
			default: System.out.println("invalid input. please try again.");
			}
			System.out.println("\n\n");
		} while (choice !=5);
	}

	private void insertNewRecord () throws Exception {
		Staff staff = null;
		boolean success = false;

		staff = inputValues(); 
		success = db.saveRecord(staff);
		System.out.println(success? "record added sucessfully": "error occur while adding a record");

	}

	public boolean isValidName(String text) {
		int len = text.length();
		for (int cnt=0; cnt<len; cnt++) {
			char temp = text.charAt(cnt);	 
			if (Character.isLetter(temp) || Character.isWhitespace(temp))
				;
			else
				return false;
		}
		return true;
	}

	public String inputStaffName () {
		String name=null;
		boolean validName = false;

		//prompt user to enter staff name, which need contains letters or spaces only
		do {
			System.out.print("enter Staff Name: ");
			name = scan.nextLine();
			validName = isValidName(name);
			if (!validName)
				System.out.println(name + " is not valid.  please enter a new name");

		} while (!validName);
		return name;
	}

	public Staff inputValues() throws Exception {
		final  String[] POSITION = {"Analyst", "Designner", "Operator","Programmer", "Trainer"};	
		Staff staff = null;
		String name=null, sPosition=null, sGender=null;
		char gender=' ';
		int age =0, position = 0;
		boolean existName = false, validGender=false;

		//prompt user to enter staff name
		do {
			name = inputStaffName();
			existName= db.isExistName(name);
			if (existName){
				System.out.println(name + " already exist. please re-enter");
			}
		} while (existName);

		//prompt user to enter age, which need to within 18-55
		do {
			System.out.print("enter age (within 18-55): ");
			age = scan.nextInt();
			if(age<18 || age>55 )
				System.out.println("invalid age. please re-enter");
		} while (age<18 || age>55 );

		//prompt user to select a position
		do {
			System.out.println("1. Analyst");
			System.out.println("2. Designner");
			System.out.println("3. Operator");
			System.out.println("4. Programmer");			
			System.out.println("5. Trainer");		
			System.out.print("select a position (1-5): ");
			position = scan.nextInt();
			if (position <1 || position > 5)
				System.out.println("invalid position");
			else
				sPosition = POSITION[position-1];
		} while (position <1 || position > 5);
		scan.nextLine();
		//prompt user to enter gender, either male or female
		do {
			System.out.print("enter gender (m-male, f-female): ");
			gender = scan.nextLine().charAt(0);
			switch (gender) {
			case 'M', 'm': sGender="male"; 
			validGender=true;
			break;
			case 'F', 'f' : sGender="female"; 
			validGender=true;
			break;
			default : System.out.println("invalid gender. please re-enter");
			}				
		} while (!validGender);

		//construct Staff instance
		staff = new Staff (name, age, sPosition, sGender);
		return staff;		
	}

	public void deleteARecord () throws Exception {
		boolean existName=false, success = false;
		String name = null;
		int ans=0;

		name = inputStaffName();
		existName = db.isExistName(name);
		if (existName) {
			System.out.println(name +"'s record found");
			do {
				System.out.println("are you sure to delete (1-yes, 2-no)? ");
				ans = scan.nextInt();
				if (ans !=1 && ans !=2) {
					System.out.println("invalid input. please try again");
				}
			} while (ans !=1 && ans!=2);

			if (ans==1) {
				success = db.deleteARecord(name);
				System.out.println(success? "record deleted sucessfully": "error occur while deleting a record");
			}
		} else 
			System.out.println("staff record does not exist");
	}

	void printTitle () {
		System.out.printf("%-10s %-10s %-10s %-10s","Name","Age", "Position", "Gender");
		System.out.println();
		for (int cnt=0; cnt<40; cnt++)
			System.out.print("=");		
		System.out.println();
	}

	public void viewAll () throws Exception {
		Staff staff[] = db.retrieveAll();
		if (staff != null) {
			printTitle();
			for (Staff s:staff)
				System.out.println(s);
		}
	}


}

class Staff {
	String name;
	int age;
	String position;
	String gender;
	public Staff(String name, int age, String position, String gender) {
		this.name = name;
		this.age = age;
		this.position = position;
		this.gender = gender;
	}

	public String toString() {
		return String.format("%-10s %-10s %-10s %-10s",name,age,position,gender);
	}		
}