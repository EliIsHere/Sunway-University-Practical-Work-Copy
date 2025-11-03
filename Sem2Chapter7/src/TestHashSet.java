import java.util.*;

public class TestHashSet {
	public static void main(String[] args) {
		HashSet set1 = new HashSet();
		set1.add("apple");
		set1.add(10);
		set1.add('p');
		System.out.println("set1: "+set1);
		
		HashSet <Integer> set2 = new HashSet<Integer>();	//will auto sort for you (based on algorithm made)
		set2.add(10);
		set2.add(20);
		set2.add(30);
		set2.add(5);
		set2.add(10);
		set2.add(20);
		System.out.println("hash set:" + set2);
		
		set2.remove(30);
		System.out.println("hash set after remove 30:" + set2);
		System.out.println("size: "+ set2.size());
		System.out.println(set2.isEmpty());
		
		LinkedHashSet <Integer> set3 = new LinkedHashSet<Integer>();	//this one will store based on order you store it in
		set3.add(10);
		set3.add(20);
		set3.add(30);
		set3.add(5);
		set3.add(30);
		set3.add(5);
		System.out.println("LinkedHashSet:" + set3);
		
		TreeSet <Integer> set4 = new TreeSet<Integer>();	//will auto sort for you (not based on algorithm made)
		set4.add(10);
		set4.add(20);
		set4.add(30);
		set4.add(5);
		System.out.println("TreeSet: " + set4);
	
	
	}
}