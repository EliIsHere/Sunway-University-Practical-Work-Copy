import java.util.*;
import java.lang.Math;
public class sd_cal {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		double MEAN = 40.7625;
		double sum = 0, result = 0;
		double inputNum = 0;
		int count=0;

		do {
			System.out.println("Count = "+(count+1));
			System.out.println("Input number (type 0 to stop):  ");
			inputNum = scan.nextDouble();
			
			
			if (inputNum != 0) {
			sum = sum + Math.pow((inputNum - MEAN), 2);
			
			count++;
			} 

		}while (inputNum != 0);

		result = Math.sqrt(sum/(count-1));
		
		System.out.printf("Count: %d\nSum: %.2f\nResult: %.2f", count, sum, result);




	}

}
