import java.lang.Math;

public class Problem3 {
	public static void main(String[] args) {
		int num = (int)Math.floor(Math.random()*31);
		System.out.println("The result for "+num+" is: "+compute(num));
	}

	static int compute(int num) {
		if (num>0) {
			return compute(num-1) + num;
		}else {
			return 0;
		}
	}
}
