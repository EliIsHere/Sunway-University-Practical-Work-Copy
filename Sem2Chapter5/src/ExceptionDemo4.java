import java.util.*;
public class ExceptionDemo4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0; 
		boolean valid = true;

		do {
			valid = true;
			System.out.println("Enter an integer here: ");
			try {
				num = scan.nextInt();
			}catch(InputMismatchException ex) {
				scan.nextLine();
				System.out.println("Error: Invalid input");
				valid = false;
			}

		}while(valid == false );

		System.out.println("Interger inputed successfully\nInteger inputted: "+num);

	}

}
