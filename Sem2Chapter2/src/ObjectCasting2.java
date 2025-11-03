
public class ObjectCasting2 {
	public static void main(String[] args) {
		child1 c1 = new child1();
		parent1 p1 = c1;		//small to big --> direct assignment (implicit casting)
		System.out.println(p1.num1);
		System.out.println(((child1)p1).s2);		//casting here (explicit)
		
		parent1 p2 = new child1();//valid
		p2.num1 = 10;//valid
		//p2.s2 = 12;		syntax error cuz parent can't touch child stuff
		
		
		parent1 p3 = new parent1();
		//child c2 = p3;		//syntax error
		child1 c3 = (child1)p3;		//explicit casting (big to small)
	}

}

class parent1 {
	int num1;
}

class child1 extends parent1{
	String s2;
}
