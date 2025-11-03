
public class SuperConstructor {
	public static void main(String[] args) {
		A1 a1 = new A1(10);
		System.out.println();
		A2 a2 = new A2();
		System.out.println();
		A3 a3 = new A3();
		System.out.println();
	}

	public SuperConstructor() {
		super();
		// TODO Auto-generated constructor stub
	}
}

class A1 {
	A1 (int num) {
		System.out.println("in A1 constructor "+num);
	}

	A1(){

	}
}

class A2 extends A1 {
	A2(String str){
		this();
		System.out.println("from super "+str);
		//super();	//syntax error
	}

	A2 () {
		super(1);		//super constructor must be the 1st command in a method block if want to use it
		//this("apple");	//syntax error		//this() command can't be used with super as both requires them being the 1st stmt
		System.out.println("in A2 constructor");
	}

	A2(int n1, int n2){

	}
}

class A3 extends A2 {
	A3 () {
		super("we");
		System.out.println("in A3 constructor");
	}
}
