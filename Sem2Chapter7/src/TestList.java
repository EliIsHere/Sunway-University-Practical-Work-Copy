import java.util.*;

public class TestList {
	public static void main(String[] args) {
		useArrayList();
		System.out.println("-------------------------------");
		useLinkedList();
	}
	static void useLinkedList () {
		LinkedList <Character> list2 = new LinkedList<Character>();
		list2.add('c');
		list2.add('d');
		list2.add('a');
		list2.add('z');
		System.out.println(list2);
		list2.addFirst('p');
		list2.addLast('m');
		System.out.println(list2);
		
		for(char temp: list2)
			System.out.println(temp);
		
		System.out.println("size: "+ list2.size());
		
		list2.remove(0);
		System.out.println(list2);
		list2.removeLast();
		System.out.println(list2);
	}
	
	static void useArrayList() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(15);
		list.add(5);
		list.add(20);
		System.out.println(list);
		System.out.println("size: "+ list.size());
		
		for (int cnt=0; cnt<list.size(); cnt++)
			System.out.printf("%d: %d\n", cnt, list.get(cnt));
		System.out.println();
		
		for(int temp: list)
			System.out.println(temp);
				
		list.add(0, 25);
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
		list.remove((Integer)20);
		System.out.println(list);
		
	}
	
	
}

