import java.util.*;
public class TestStack {
	public static void main(String[] args) {
		Stack <Integer> stack= new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(5);
		stack.push(100);

		System.out.println(stack);
		System.out.println("size: "+ stack.size());

		for (int cnt=stack.size(); cnt>0; cnt--)
			if (!stack.empty())
				System.out.println(stack.pop());		

		//System.out.println(stack.empty());

		if (!stack.empty()) {
			System.out.println(stack.peek());//100	//looks at latest one
			System.out.println(stack.pop());
			System.out.println(stack.peek());//5
		}

	}
}