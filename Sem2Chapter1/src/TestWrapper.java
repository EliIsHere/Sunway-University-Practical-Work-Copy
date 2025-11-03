

public class TestWrapper {
	public static void main(String[] args) {
        //wrapper
		
		byte num1 = 10;  //primitive data type
		Byte num2 = 10;  //Wrapper class, object
		//^interchangable
		
		num1=num2; //valid
		num2 = num1; //valid
		
		int num3 = num1; //valid => bcos int (32-bits) can hold byte(8-bits) value
		//Integer num4= num2;  //syntax error bcos Byte IS NOT an Integer 
		
	
		char ch = 'q';
		Character ch2 = ch; //valid
		Character ch3 = 'w'; //valid
		//Character ch4 = "we"; //syntax error
		
	/*	
		byte => Byte
		short => Short
		int => Integer
		long =>Long
		float =>Float
		double =>Double
		char =>Character
		boolean =>Boolean
		
		only can cast same type (cannot wrapper class to primitive data type)
		tho can convert like normal (ex: Character ch = 1; char ch1 = ch;)
	*/
	}
}