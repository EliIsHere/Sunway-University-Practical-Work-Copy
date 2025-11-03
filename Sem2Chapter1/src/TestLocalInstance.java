
public class TestLocalInstance {
	int num=10; //instance variable

	public static void main(String[] args) {
		int num;  //local variable does not have any default
		//System.out.println(num);  //syntax error		//local no default value and not properly initialize

		//public String str; //syntax error
		//protected char cj='p'; //syntax error
		//private double dnum=0.12;  //syntax error*		//local variable can't add private, protected, private etc of that kind
	}

	void sub() {
		num=10; //valid bcos it is referred to the instance variable num
		int num = 100; //local variable
		System.out.println(num);  //100 =>local variable
		System.out.println(this.num);  //instance variable
	}


	/*
	void sub2() {
		for (int cnt=1; cnt<5; cnt++)
			System.out.println(cnt);

		System.out.println(cnt); //syntax error
	}
	 */
}
