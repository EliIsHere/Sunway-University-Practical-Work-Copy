import java.util.Scanner;

public class Chapter2 {
	public static void main (String args[]) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please input your name here: "); 
		
		//user enter ###
		
		String name = scan.nextLine();
		
		//display ###
		
		System.out.println("Hello " + name + '\n');
	}

}
