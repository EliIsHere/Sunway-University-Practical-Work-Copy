
public class MethodWithReturnValue {
	public static void main(String[] args) {
		T3 t3 = new T3();
		t3.sub1();
		System.out.println(t3.sub1());
		int ans = t3.sub1();
		
		
		int arr[] = t3.sub2();
		for (int temp:arr)
			System.out.println(temp);
		
		Bicycle temp = t3.sub3();
		System.out.println(temp.color);
	}
}

class T3 {
	public int sub1() {
		return 10;
	}
	
	public int[] sub2() {
		int num[] = {1,2,3,4};
		return num;
	}
	
	Bicycle sub3() {
		Bicycle bb = new Bicycle ("red");
		return bb;
	}
}



class Bicycle {
	String color;
	Bicycle (String color) {
		this.color = color;
	}
}