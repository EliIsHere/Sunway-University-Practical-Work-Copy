//try --> catch
//try --> catch --> finally
//try --> finally

//finally is GUARANTEED to run
public class tryCatchFlow {
	void method1() {
	//	try {
		System.out.println(10/0);
		//}catch (Exception ex) {
			//System.out.println("In line 5");
		//}
	}
	
	void method2() {
		method1();
	}
	
	void method3() {
		try {
		method2();
		}catch(Exception ex) {
			System.out.println("In line 17");
		}
	}
	
	public static void main(String[] args) {
		try {
		tryCatchFlow tcf = new tryCatchFlow();
		tcf.method3();
		}catch(Exception ex) {
			System.out.println("In line 22");
		}
		
	}
}