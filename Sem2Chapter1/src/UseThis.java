
public class UseThis {
	void sub (Bicycle90 bb) {//will only work of bicycle
		System.out.println(bb.color);
		System.out.println(bb.length);
	}
	
	public static void main(String[] args) {
		/*//execute subMethod() - method 1
		System.out.println("method1");
		UseThis ut = new UseThis();
		Bicycle90 bike = new Bicycle90("red", 42);
		ut.sub(bike);//subs bike into ut
		
		
		//method 2
		System.out.println("method2");
		new UseThis().sub(new Bicycle90("red", 24));*/
		
		Bicycle90 b1 = new Bicycle90();
		b1.exe();
	}
}

class Dress{
	void exe() {
		UseThis ut3 = new UseThis();
		//ut3.sub(this);//error cuz can only sub in bicycle
	}
}

class Bicycle90 {
	String color;
	int length;
	
	Bicycle90 (String c, int len){
		this.color = c;
		this.length = len;
	}
	
	Bicycle90 () {
		this(null, 0);
	}
	
	void display ( ) {
		System.out.println("color:" + color);
		System.out.println("color:" + this.color);
		System.out.println("length:" + this.length);
	}
	
	void exe () {
		color="blue";
		length =32;
		
		//execute sub method in the UseThis class - method 3
		UseThis ut2 = new UseThis();
		ut2.sub(this);
	}
}

