class A{}
final class B{}//final class is last generation

class APt1 extends A{}
//class B1 extends B{} //syntax error as final class

class Class1{
	void sub() {}
	final void sub2() {}
}

class Class2 extends Class1{
	void sub() {}
	//void sub2() {}		//syntax error as final method so child can't call it
}

class FinalVariable{
	final int NUM = 10;		//remember? It's a fix variable
	final int NUM2;
	
	FinalVariable (int size){
		NUM2 = size;
	}
	
	public static void main(String[] args) {
		Class1 c1 = new Class1();
		c1.sub();
		c1.sub2();
		
		FinalVariable fv = new FinalVariable(-5);
		System.out.println(fv.NUM);
		System.out.println(fv.NUM2);
		
		FinalVariable fv2 = new FinalVariable(1000);
		System.out.println(fv2.NUM);
		System.out.println(fv2.NUM2);
		
	}
}
