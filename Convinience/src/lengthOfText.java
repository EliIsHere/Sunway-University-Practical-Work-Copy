import java.util.*;
public class lengthOfText {
	public static void main (String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter text: ");
		String text = scan.nextLine();
		
		System.out.println(text.length());
		System.out.println("Create line? (yes-true, no-false");
		boolean line = scan.nextBoolean();
		
		if (line==true) {
			for (int cnt=1;cnt<=text.length();cnt++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}
}
