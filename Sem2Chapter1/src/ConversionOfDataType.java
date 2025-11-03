
public class ConversionOfDataType {
	public static void main(String[] args) {
		int num = 345;
		String str = Integer.toString(num);
		String str1 = num+"";
		
		System.out.println(str+12);
		System.out.println(str1+12);
		
		String s1 = "12345";
		int i1 = Integer.parseInt(s1);
		
		System.out.println(i1 + 1);
		
		String random = "True";
		boolean truth = Boolean.parseBoolean(random);
		System.out.println("truth = "+truth);
	}
}
