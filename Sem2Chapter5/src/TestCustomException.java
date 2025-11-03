
public class TestCustomException {
	void sub (int num) throws MyException{
		if (num%2 == 0)
			throw new MyException(10,num+" is an even number");
		else
			throw new MyException(20,num+" is an odd number");
	}
	
	public static void main(String[] args) {
		TestCustomException tce = new TestCustomException();
		try {
			tce.sub(101);
		}catch(MyException ex) {
			System.out.println(ex.toString());
		}
		
		try {
			tce.sub(200);
		}catch (MyException ex) {
			System.out.println(ex.toString());
		}
	}
}

class MyException extends Exception{
	private int errorNo;
	private String msg;
	
	MyException(int i, String s){
		super(s);
		this.errorNo = i;
		this.msg = s;
	}
	
	public String toString() {
		return errorNo + ":" + msg;
	}
}
