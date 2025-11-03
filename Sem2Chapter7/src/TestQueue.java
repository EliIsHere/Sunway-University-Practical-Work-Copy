import java.util.*;

public class TestQueue {
	public static void main(String[] args) {
	//	Queue <Integer> q2 = new Queue<Integer>(); //syntax error
	
		Queue <Integer> q = new LinkedList<Integer> ();
		q.offer(10);  //add element to the tail(end) of the queue
		q.offer(12);
		q.offer(5);
		q.offer(20);
		System.out.println(q);
		
		System.out.println(q.poll()); //remove element from the head of the queue
		System.out.println("after remove 1 value: " + q);
		
		System.out.println("size: " + q.size());
		System.out.println(q.isEmpty());
		while(!q.isEmpty())
			System.out.println(q.poll());
	
	}
}
	