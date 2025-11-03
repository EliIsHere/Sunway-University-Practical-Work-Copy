import java.lang.Math;

public class Problem2 {
	public static void main(String[] args) {
		int num = (int) Math.floor(Math.random() * 21);
		System.out.println("2 to the power of "+num +" is: " + compute(num));
	}
	
	static int compute(int n) {
		switch (n) {
		case 0: return 1;
		case 1: return 2;
		default: return 2* compute(n-1);
		}
		
	}
	
}
