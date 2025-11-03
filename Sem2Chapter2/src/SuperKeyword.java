
public class SuperKeyword {

}

class X{
	int num;
	String s;
	void sub() {

	}
}

class Y extends X{//parent and child MUSTNOT have the same name
	double d;

	void sub2() {
		this.num = 10;
		super.num = 10;
		num = 10;

		d = 0.24;
		this.d = 0.23;
		//super.d = 024;		//syntax error as part of same class		//only use it to use info from parent class

		sub();
		this.sub();
		super.sub();
	}
}
