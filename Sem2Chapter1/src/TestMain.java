
public class TestMain {
	public static void main (String[] args) {
		new T2().sub();
		
	}

}

class T2{
	public static void main(String[] args) {
		if (args==null)
			System.out.println("args is null");
		else
			System.out.println(args.length);;
	}
	
	void sub() {
		main(new String[3]);
		System.out.println();
		main(null);
	}
}
