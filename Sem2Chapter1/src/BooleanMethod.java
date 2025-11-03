
public class BooleanMethod {
	static boolean isTrue () {
		System.out.println("in method");
		return false;
	}

	public static void main(String[] args) {
		int num=10;


		if (isTrue())//if return true
			System.out.println("line 15");

		else//if return false
			System.out.println("lie 17");

		System.out.println("-------------------");

		if (num>0||isTrue())
			System.out.println("up");
		else
			System.out.println("down");

		System.out.println("-------------------");

		if (num<0||isTrue())
			System.out.println("up");
		else
			System.out.println("down");

		System.out.println("-------------------");

		if (num>0 |/*|will check everything unlike ||*/isTrue())
			System.out.println("up");
		else
			System.out.println("down");

		System.out.println("-------------------");

		isTrue();
		System.out.println(isTrue());

		System.out.println("-------------------");

		if (num<0||isTrue())
			System.out.println("up");
		else
			System.out.println("down");

		if (2>3 && isTrue())
			System.out.println("here");
		else
			System.out.println("there"); 

		if (3>2 && isTrue())
			System.out.println("here2"); 
		else
			System.out.println("there2");

		if (2>3 & isTrue())
			System.out.println("here3");
		else
			System.out.println("there3"); 

		if (3>2 ||4>2)
			System.out.println("line 30");
		else
			System.out.println("ine 32");
	}
}


