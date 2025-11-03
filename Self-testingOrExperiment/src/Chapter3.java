import java.util.*;
public class Chapter3 {
	public static void main (String args[]) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter a gender: ");
		char gender = scan.nextLine().charAt(0);
		
		if (gender == 'm' || gender == 'M') {
			System.out.println("You are a male individual. ");
			
		} else if (gender=='f' || gender=='F') {
			System.out.println("You are a female individual. ");
		}
		
				
	}

}
