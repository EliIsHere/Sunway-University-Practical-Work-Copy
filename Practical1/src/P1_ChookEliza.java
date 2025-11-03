import java.util.*;

public class P1_ChookEliza {
	SqlDatabase database = new SqlDatabase();
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		P1_ChookEliza records = new P1_ChookEliza();
		Scanner scan = new Scanner(System.in);

		int selection = 0; 
		
		//display menu
		System.out.println("Staff Records: ");

		while (selection != 4) {
			System.out.println("\nWould you like to:"
					+ "\n1 - Insert new data"
					+ "\n2 - Delete existing data"
					+ "\n3 - View All Staff Records"
					+ "\n4 - Leave program"
					+ "\n\nSelect options by entering either 1 , 2, 3 or 4");
			
			selection = scan.nextInt();
			scan.nextLine();
			
			//process input and direct them to respective method blocks unless chose to exit/invalid input
			if (selection == 1)
				records.InsertData();
			else if (selection == 2)
				records.DeleteData();
			else if (selection == 3)
				records.ViewRecords();
			else if (selection == 4)
				System.out.println("Left staff database program");
			else
				System.out.println("Information inputted is not valid. \nPlease reselect your options (only accept 1, 2, 3, and 4)");
		}


	}

	public void InsertData() throws Exception {//insert data
		String name, position;
		char gender;
		int age=0;
		boolean valid = false;
		
		//menu to let person input staff data
		while (valid == false) {//will ask questions again if input is invalid
			System.out.println("Please enter the name of the staff: ");
			name=scan.nextLine();

			System.out.println("Please enter their age (must be between age 18 and 55): ");
			age = scan.nextInt();
			scan.nextLine();

			System.out.println("Please enter their position (only alphabets and spaces are valid): ");
			position = scan.nextLine();

			System.out.println("Please enter their gender (accept only small case m and f): ");
			gender = scan.next().charAt(0);
			scan.nextLine();
			
			//checks if data are valid and are inputed into database
			database.StaffDatabase();
			String resultOfInput = database.InsertStaffRecord(name, age, position, gender);

			System.out.println(resultOfInput);

			if (resultOfInput=="Staff information has been successfully inputted into the database. ")
				valid=true;
		}


	}

	public void DeleteData() throws Exception {//delete data
		database.StaffDatabase();
		String name=null;
		Boolean foundData=false;
		int confirmation=0;

		//ask name(unique value) of staff data they want to delete
		while(foundData==false) {//will loop if can't find data in database
			System.out.println("State the staff name of the staff data you want to delete: ");
			name = scan.nextLine();
			
			//finds data and sends results from find
			String data = database.FindDataToDelete(name);
			System.out.println(data);

			if (data != "Data does not exist in the database. \nPlease type in another name. ") {//if found data in database
				foundData = true;

				do {//ask if they want to delete it
					System.out.println("Do you wish to delete is data? (1 if yes and 0 if no)");
					confirmation = scan.nextInt();
					scan.nextLine();

					if (confirmation !=1 && confirmation!=0) {//if invalid responds
						System.out.println("Invalid input (only accept 0 and 1)\nPlease re-enter your responds. ");

					}else if (confirmation==0) {//if don't want to delete
						System.out.println("Data will not be deleted. ");
						
					}else {//if want to delete
						String delete = database.DataToDelete(name);
						System.out.println(delete);
					}

				}while (confirmation !=1 && confirmation!=0);//loops if input provided is invalid
			}
		}
	}




	public void ViewRecords() throws Exception {//view database
		database.StaffDatabase();
		String[] viewRecords = database.ViewAllRecords();//collects data in database

		if (viewRecords.length <=0) {//if database is empty
			System.out.println("The staff database is currently empty. ");

		} else {//if found data, will print out all data found
			for (String temp:database.ViewAllRecords())
				System.out.println(temp);
		}




	}

}
