
public class Printf {
	public static void main(String[] args) {
		int number=23;
		String str = "123, Jalan Besar";
		double dnum = 19.49;
		
		System.out.println("number: "+ number);
		System.out.println("address: " + str);
		System.out.println("price: RM"+ dnum);
		
		System.out.printf("\nnumber: %d", number);
		System.out.println();
		System.out.printf("address: %s", str);
		System.out.println();
		System.out.printf("price: RM%.2f", dnum);
		System.out.printf("\n%d, %.1f", number, dnum);
	}
}
