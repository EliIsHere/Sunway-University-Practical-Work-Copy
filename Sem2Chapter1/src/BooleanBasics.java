public class BooleanBasics{
	public static void main (String[]args) {
		boolean valid = false;
		int num = 10;
		
		valid = num>0;
		
		System.out.println(valid);
		
		
		System.out.println("-----------------");
		String str = "Joe";
		
		Boolean validName = str.equals("Joe");
		System.out.println(validName);
		
		
		System.out.println("-----------------");
		if(valid)
			System.out.println("More than 0");
		else
			System.out.println("Less than 0");
		
		System.out.println("-----------------");
		if(!validName)
			System.out.println("Name not Joe");
		else
			System.out.println("Name is Joe");
		
		System.out.println("-----------------");
		int x = 3;
		char y = (x>0)?'t':'f';
		System.out.println(y);
		
	}
}

