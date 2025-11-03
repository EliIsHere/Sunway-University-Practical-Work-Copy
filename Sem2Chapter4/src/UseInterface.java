//1. constant. no variable
//2. abstract method. no concrete method/constructor
//3. support multiple inheritance

interface X{
	//int num;		//syntax error		//valid
	final int NUM2 = 10;	//valid
	char CH = 'k';  //valid => public static final char CH='k';
	
	//cannot have constructor
	//X(){}		//syntax error
	//void sub(){}		/syntax error
	
	
	//can only have abstract methods and constants
	abstract void sub2();		//valid
	String sub3();		//valid
	
}

class Test{
	void sub() {
		System.out.println(X.NUM2);
		char temp = X.CH;
	}
}

interface Y{
	void sub3();
}
interface Z{}
class XX{}

class X3 extends XX implements Y,Z{
	public void sub3() {
		System.out.println(X.CH);
		System.out.println(X.NUM2);
	}

}
//class X4 implements Y,Z extends XX{}		//syntax error

class X1 implements X{
	public void sub2() {}
	
	//String sub3() {} //syntax error as not public	
	public String sub3() {
		return "";
	}	
}

//class X2 implements X,Y,Z{		//syntax error for sub methods because need to specify if from either X, Y, or Z
class X2 implements X,Z{
public void sub2() {}
	
	public String sub3() {
		return "";
	}	
	//public void sub3(){}		//syntax error
}

public class UseInterface {

}
