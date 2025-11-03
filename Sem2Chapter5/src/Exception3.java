
public class Exception3 {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}catch(Exception ex) {
			ex.printStackTrace();//will show in console what happened
		}
		
		int num[]= {1,2,3};
		try {
			System.out.println(num[4]);
		}catch(Exception ex) {
			ex.printStackTrace();//will show in console what happened
		}
	}

}
