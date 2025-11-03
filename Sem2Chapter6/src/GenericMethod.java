import java.util.*;

public class GenericMethod {
	public static void main(String[] args) {
		MyClass mc = new MyClass();

		int num1 = 100;
		double dnum = 0.12;
		String str = "Apple";
		Integer num2 = 100;
		Double dnum2 = 0.12;

		mc.sub(num1);
		mc.sub2(dnum2);
		mc.sub2(num2);
		mc.sub3(str);
		mc.sub3(dnum);

		//int []arr = {1,2,3,4,5,6};		//invalid since primitive type
		Integer []arr = {1,2,3,4,5,6};		//valid
		mc.sub4(arr);

		Character [] arr2 = {'s', 'd', 'f'};
		mc.sub4(arr2);

		Double [] arr3= {0.2, 1.2, 3.4};
		mc.sub4(arr3);
		
		ArrayList <Integer>list1 = new ArrayList<Integer>();
		ArrayList <Double>list2 = new ArrayList<Double>();
		ArrayList <Double>list3 = new ArrayList<Double>();
		mc.sub6(list1);
		mc.sub6(list2);
		mc.sub6(list3);
	}
}



class MyClass{
	void sub(int num) {
		System.out.println(num);
	}

	public <E> void sub (E num) {//the value in <> (can be called as anything) allows to get any object type
		System.out.println(num);
	}

	public <W> void sub2 (W num) {
		System.out.println(num);
	}

	public <RandomWord> void sub3 (RandomWord num) {
		System.out.println(num);
	}

	public <EE> void sub4 (EE arr[]) {
		System.out.println(arr.length);
		for (EE e:arr)
			System.out.println(e);
		System.out.println();
	}
	
	public <E> void sub6 (ArrayList <E> list) {}
	
	void sub12(int num) {
		System.out.println(num);
	}

}
