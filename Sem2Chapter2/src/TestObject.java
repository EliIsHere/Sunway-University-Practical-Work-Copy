
public class TestObject {
	public static void main(String[] args) {
		Object obj = new Pen();
		
		Tree tree = new Tree();
		Object obj2 = tree;
		
		Employeee emp = new Employeee();
		Object obj3 = emp;
		
		
		//Step 1
		Managers mgr = new Managers();
		
		//Step 2
		Employeee employ = mgr;
		
		//Step 3
		Object object = employ;
		
		//Step 4
		Pen pen = (Pen)object;
	}

}

class Pen{}
class Tree{}
class Employeee{

	//@Override
	public String toString() {
		return "Employeee []";
	}

}
class Managers extends Employeee{}
