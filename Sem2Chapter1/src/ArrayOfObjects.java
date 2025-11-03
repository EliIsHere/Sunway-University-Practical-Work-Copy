
public class ArrayOfObjects {
	/*public static void main (String[] args) {
		int temp[] = getNumbers();
		for (int number:temp) {
			System.out.println(number);
		}

		//option 1
		int num2[] = {10,20,30};
		setNumbers(num2);

		//option 2
		setNumbers(new int[] {1000,200, 3});

	}*/

	public static int[] getNumbers() {
		int num[] = {1, 2, 3, 4, 5};
		return num;//method 1

		///*method2:*/return new int[] {1,2,3,4,5};		//return array (initialized one the spot)
		//method 3: return new int[6];		//return array with 6 empty spaces

	}

	public static boolean setNumbers(int num[]) {
		System.out.println(num.length);
		if (num.length>1) {
			System.out.println(num[0] + ","+num[1]);
		}

		return true;

	}

	public static Cars[] getCars() {
		Cars cc[] = new Cars[2];
		cc[0] = new Cars("Proton", 2020);
		cc[1] = new Cars("Viva", 2023);
		
		//option 1:		return cc;
		
		//option 2
		return new Cars[] {new Cars("Proton", 2020), new Cars("Viva", 2023)};

	}

	public static void setCars (Cars cars[]) {
		for (int cnt=0; cnt<cars.length;cnt++)
			System.out.println(cnt + ":" + cars[cnt]);

	}

	public static void main(String[] args) {
		Cars c1 = new Cars("Proton", 2020);
		Cars c2 = new Cars("Viva", 2023);

		//option 1
		Cars arr[] = new Cars[5];
		arr[0] = c1;
		arr[1] = c2;
		arr[2] = c1;
		arr[3] = new Cars("Honda", 2022);
		arr[4] = new Cars("ToBeMade", 2027);

		//option 2
		Cars arr2[] = {new Cars("Volvo", 2021),
				new Cars("Toyota", 2022), 
				new Cars("Myvi", 2020)};

		for (Cars temp:arr)
			System.out.println(temp);

		System.out.println();

		for (Cars temp:arr2)
			System.out.println(temp);

		setCars(arr);

	}
}

class Cars{
	String model;
	int year;
	public Cars(String model, int year) {
		this.model = model;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", year=" + year + "]";
	}


}
