
public class PrimitiveParameter {
	public static void main(String[] args) {
		int number=10;
		char ch='a';
		MyClass12 mc = new MyClass12();
		System.out.println("line 7 number: " + number);
		mc.sub1(number);
		System.out.println("line 9 number: " + number);
		
		String text = "john";
		System.out.println("line 12 text: " + text);
		mc.sub2(text);
		System.out.println("line 14 text: " + text);
		
		System.out.println("line 16 ch: " + ch);
		mc.sub3(ch);
		System.out.println("line 18 ch: " + ch);
	}
}

class MyClass12 {
	void sub1(int num) {//unless added return statement, values here are temp unless ref data type
		System.out.println("num:" + num);
		num=100;
		System.out.println("num:" + num);
	}
	
	void sub2(String str) {
		System.out.println("str:" + str);
		str = "orange";
		System.out.println("str:" + str);
	}
	
	void sub3(char ch) {
		System.out.println("ch:" + ch);
		ch ='k';
		System.out.println("ch:" + ch);
	}
}