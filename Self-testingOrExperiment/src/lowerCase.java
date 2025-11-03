import java.util.*;
public class lowerCase {
	public static void main (String[]args) {
		Scanner scan = new Scanner (System.in);
		int cnt=0;
		while (cnt==0) {

			System.out.println("Add text:");
			String text = scan.nextLine();

			System.out.println("New Text:");
			System.out.println(text.toLowerCase());
		}
	}
}
