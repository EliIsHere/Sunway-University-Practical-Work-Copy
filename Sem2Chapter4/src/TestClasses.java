
abstract class Parent{
	abstract void sub();
	public abstract void sub3();
	void sub2() {	}
}

class Child1 extends Parent{
	void sub() {}
	public void sub3() {}
}

class Child2 extends Parent{
	void sub() {}
	public void sub3() {}

}

//class Child3 extends Parent{
//	//Child3 can't compile as it doesn't implement the sub() method
//	public void sub3() {}
//
//}

class Child4 extends Parent{
	void sub() {
		sub2();
	}
	public void sub3() {}

}

class TestClasses {
	public static void main(String[] args) {
		//Parent p1 = new Parent();		//syntax error
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		Child4 c4 = new Child4();


	}

}
