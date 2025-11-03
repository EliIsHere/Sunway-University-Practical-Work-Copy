public class Example2 {
	
	public static void main(String[] args) {
		System.out.println("sum for 1 - 5 is "+sum1());
		System.out.println();
		System.out.println("sum for 1 - 5 is "+sum2(1));
		System.out.println();
		System.out.println("sum for 1 - 5 is "+sum3(5));
		System.out.println(line(("sum for 1 - 5 is "+sum3(5)).length()));
		System.out.println();
		System.out.println(fib(5));
		System.out.println(fib(8));
		System.out.println(fib(6));
		System.out.println();
		System.out.println(fac1(5));//5*4*3*2*1
		System.out.println(fac2(5));
		System.out.println(fac3(5));
		System.out.println(fac4(5));
	}
	
	static String line (int len) {
		String line = "";
		for (int cnt=1; cnt<=len; cnt++) {
			line = line + "-";
		}
		return line;
	}
	
	static int fac1(int num) {
		int ans=1;
		for (int cnt=1; cnt<=num; cnt++)
			ans = ans * cnt;
		return ans;
	}
	
	static int fac2(int num) {
		if(num>1)
			return num*fac2(num-1);
		else
			return 1;
	}
	
	static int fac3(int num) {
		if(num==1)
			return 1;
		else
			return num*fac3(num-1);
	}
	
	static int fac4(int num) {
		switch (num) {
		case 1: return 1;
		default: return num*fac4(num-1);
		}
	}
	
	static int fib(int num) {
		if (num==0)
			return 0;
		else if (num==1)
			return 1;
		else
			return fib(num-1)+fib(num-2);
	}
	
	static int sum1() {
		int total=0;
		for (int cnt=1;cnt<=5;cnt++)
			total = total + cnt;
		return total;
	}
	
	static int sum2(int num) {
		if (num==5) {
			return 5;
		}else if (num<=5) {
			return num+sum2(num+1);
		}
		return 0;
				
	}
	
	static int sum3(int num) {
		if (num>1)
			return num + sum3(num-1);
		else
			return 1;
	}
}
