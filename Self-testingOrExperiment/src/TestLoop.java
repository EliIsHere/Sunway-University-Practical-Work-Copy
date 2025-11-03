
public class TestLoop {
	public static void main(String[] args) {
		int count=1;//initialize counter
		System.out.println("print with a while-loop");
		while (count<=5) {//boolean exp to continue loop
			System.out.println("hello");
			count++;//adjust counter
		}
		
		System.out.println("\n\n");
		
		count=1;//reinitialize counter
		System.out.println("print with a do-while-loop");
		do {
			System.out.println("hello");
			count++;
		}while (count<=5) ;
		
		System.out.println("\n\n");
		
		//'for' only use for counter
		System.out.println("print with a for-loop");
		
		
		for(count=1/*initialized counter*/; count<=5/*loop for while...*/; count++/*after done command in for command...*/) {//like while loop
			System.out.println("hello");
		}
	}
}

