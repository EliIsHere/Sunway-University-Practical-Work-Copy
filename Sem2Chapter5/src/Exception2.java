//1. InputMismatchException
//2. ArrayIndexOutOfBoundsException
//3. ArithmeticException (?/0)
//4. NullPointerException
//5. Exception (parent)

import java.util.*;
class Book{
	String title;
}

public class Exception2 {
	static void print(Book bk) {
		System.out.println(bk.title);
	}
	
	public static void main(String[] args) {
		try{
		print(null);
		}catch (NullPointerException ex) {
			System.out.println("Book title is null");
		}
		//when stacking exceptions, make sure parents are last
		//ex: InputMismatchException then Exception
		
		
/*		Scanner scan = new Scanner(System.in);
		int num = 0;

		int arr[] = {1,2,3};

		try {

			System.out.println("Enter a number:");
			num = scan.nextInt();

			System.out.println(arr[3]);
		} catch(InputMismatchException ex) {
			System.out.println("Error: InputMismatchException");
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Error: ArrayIndexOutOfBoundsException");
		}
		*/
		
		System.out.println("End 1");
		System.out.println("End 2");

	}
}
