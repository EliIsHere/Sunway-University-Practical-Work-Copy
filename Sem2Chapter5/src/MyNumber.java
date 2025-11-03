
public class MyNumber {
	void sub() throws Exception {
		throw new Exception();
	}
	
	void sub1() throws Exception{
		
	}
	
//	void sub3() {
	//	throw new Exception();		//syntax error
	//}
	
	//MyNumber() throws Exception{
		
//	}
	
	void sub2() throws ArithmeticException, ArrayIndexOutOfBoundsException,RuntimeException {
		int num=1;
		ArithmeticException ex1;
		RuntimeException ex2;
		if (num==0)
			throw new ArithmeticException();
	//	else if (num==1)
	//		throw ex1, ex2;	//syntax error
	}
	
	public int calc(int num1, int num2) throws Exception {
		Exception ex;
		if (num1>num2)
			return num1-num2;
		else if (num1==num2)
			throw new Exception ("the 2 numbers cannot be the same");
		//	System.out.println("the 2 numbers cannot be the same");
		else {
			ex = new Exception ("num1 cannot be less than num2");
			throw ex;
		}//System.out.println("num1 cannot be less than num2");
		//return 0;
	}
	
	void sub4() throws Exception{
		try {
			calc(10,10);
		}catch(Exception ex) {
			throw ex;
		}
	}
	
	public static void main(String[] args) {
		MyNumber mn = new MyNumber();
		try {
		System.out.println(mn.calc(10, 2));
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println();
		
		try {
		System.out.println(mn.calc(10, 20));
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println();

		try {
		System.out.println(mn.calc(10, 10));
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println();
	}
}