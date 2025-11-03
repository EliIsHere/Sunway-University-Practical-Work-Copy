
public class PassByReference {
	public static void main(String[] args) {
		int num[] = {10,20,30};
		print(num);
		sub(num);
		print(num);
		
		Taxi[] taxi = sub3();
		for (Taxi temp:taxi)
			System.out.println(temp);
		System.out.println();
		
		String str[] = sub2();
		for (String temp:str)
			System.out.println(temp);
		System.out.println();
	}

	static void print (int arr[]) {
		for (int temp:arr)
			System.out.println(temp);
		System.out.println();
	}

	static void sub(int arr[]) {
		if (arr!= null) {
			arr[0] = 100;
			arr[1]= 200;
		}
	}
	
	public static String[] sub2() {
		
		String temp[] = {"apple", "orange"};
		return temp;
		
	}
	
	static Taxi[] sub3() {
		return new Taxi[] {new Taxi("IUEWFH80QJWF", "Taxi A"),new Taxi("IUE9876WF", "Taxi B"),new Taxi("Iokjn090QJWF", "Taxi C"),
		};
	}

}

class Taxi{
	String plateNo;
	String company;
	public Taxi(String plateNo, String company) {
		this.plateNo = plateNo;
		this.company = company;
	}
	@Override
	public String toString() {
		return "Taxi [plateNo=" + plateNo + ", company=" + company + "]";
	}
	
	
}
