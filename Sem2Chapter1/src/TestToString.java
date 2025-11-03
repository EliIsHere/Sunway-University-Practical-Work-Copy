
public class TestToString {
	public static void main (String[] args) {
		Car c = new Car();
		System.out.println(c);
		
		University u = new University("Sunway University", 3655875);
		System.out.println(u);
	}

}

class Car{
	void method1() {
		
	}
	void method2() {
		method1();
	}
	
	Car(){
		//Car(5);//syntax error
		this(12);//this. must be 1st statement
		method1();
	}
	Car(int n){
		System.out.println("here");
		method2();
	}
}

class University{
	String name;//instance variable
	int population;
	
	public University(String name, int population) {//parameter name
		//super();
		this.name = name;//assigned parameter name to instance variable
		this.population = population;//can switch positions will still be same
	}

	@Override//Override can be deleted if so wished		//annotations like this can be deleted		//source-> generate toString()
	public String toString() {
		return "University [name=" + name + ", population=" + population + "]";
	}
	
	/*public String toString() {
	
	return name + ", population: "+population;
	}*/
	
	
	
}



	
