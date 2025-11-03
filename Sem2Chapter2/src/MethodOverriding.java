
public class MethodOverriding {

}

class XX{
	void sub() {
		System.out.println("in XX");
	}
}

class YY extends XX{
	void sub2(){
		System.out.println("in YY");
	}
}

class ZZ extends YY{
	void sub() {
		sub2();
		super.sub2();
		System.out.println("ZZ");
		super.sub();//if parent don't have it, will automatically look for it at upper level(s)
		//super.super.sub();		//syntax error
	}
}
