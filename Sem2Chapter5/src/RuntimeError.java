import java.util.*;
public class RuntimeError {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;

		int arr[] = {1,2,3};

			System.out.println("Enter a number: ");
			num = scan.nextInt();
		try {
			System.out.println(arr[3]);//runtime error

		} catch (ArrayIndexOutOfBoundsException/*runtime error type*/ exception) {
			System.out.println("In block 2");
		}finally {
			System.out.println("Finally");
		}
		try {
			double avg = num/0;
			System.out.println(avg);
		}catch(ArithmeticException ex) {
			System.out.println("Runtime: ArithmeticException");
			
		}

		System.out.println("The End");
	}
}
