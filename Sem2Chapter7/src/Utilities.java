import java.util.*;

public class Utilities {
	public static void main(String[] args) {
		//List <Integer> list = Arrays.asList(3,6,2,10,12);
		
		ArrayList <Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(10);
		list.add(12);
		
		System.out.println("OG list: "+list);
		
		Collections.sort(list);
		System.out.println("Sorted list:"+list);
		System.out.println();
		
		//reverse order
		Collections.reverse(list);
		System.out.println("after reversing the list:" + list);
		
		//shuffle
		Collections.shuffle(list);
		System.out.println("After shuffling: " + list);
		
		
		ArrayList <Integer> list2 = new ArrayList<Integer>();
		for (int cnt=0; cnt<list.size(); cnt++)
			list2.add(0);
		System.out.println("list 2 size=" + list2.size()+":" + list2);
		Collections.copy(list2,list); //(dest, src)
		list2.add(0, 200);
		System.out.println("list : "+ list);
		System.out.println("list 2: "+ list2);
		
		Collections.fill(list2, -100);
		System.out.println(list2);
		
		System.out.println("largest : " + Collections.max(list));
		System.out.println("smallest: " + Collections.min(list));
		
	}
}