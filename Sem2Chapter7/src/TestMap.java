import java.util.*;
public class TestMap {
	public static void main(String[] args) {
		HashMap <Integer, Character> map = new HashMap <Integer, Character>();	//will auto sort for you (based on algorithm made)
		map.put(10, 'p');
		map.put(12, 'q');
		map.put(20, 'a');
		map.put(30, '2');
		map.put(10, 'b');//if same key will update value in key
		System.out.println(map);
		map.remove(12);
		System.out.println("After delete key=12: "+map);
		
		System.out.println(map.get(10));
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
	}
}