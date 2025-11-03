
public class ConstructorInheritance {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.walk();

		Child c = new Child();
		c.walk();
	}
}

class Parent{
	String name;
	void walk() {
		System.out.println("Parent is walking");

	}

	public void sub2() {
	}

}

class Child extends Parent{
	//method overriding
	//inheritance relationship
	//same method name as the parent's class
	//MUST have same parameter + return type
	//>= accessibility

	public void walk() {
		System.out.println("Child is walking");
		//walk();	//will call method in itself
		super.walk();//execute walk in parent class
	}

	//void sub2() {//can't less access than parent

	//}

}
