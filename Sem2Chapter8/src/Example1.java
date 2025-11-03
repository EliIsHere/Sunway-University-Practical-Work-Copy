//recursive method
//1. At least >=1 selection statement(s)
//2. >=1 boolean expression(base-case) to continue/stop loop
//3. >= statement to execute the method itself

public class Example1 {
	public static void main (String[] args) {
		sub1();
		System.out.println();
		sub2(1);
		System.out.println();
		sub3(10);
	}
	
	static void sub1() {//NOT recursive method
		for (int cnt=1;cnt<=10;cnt++)
			System.out.println(cnt);
	}
	
	static void sub2(int num) {//recursive method
		if (num<=10) {
			System.out.println(num);
			sub2(num+1);
		}
	}
	
	static void sub3(int num){//recursive method
		if (num>=1) {
			sub3(num-1);
			System.out.println(num);
		}
	}
}
