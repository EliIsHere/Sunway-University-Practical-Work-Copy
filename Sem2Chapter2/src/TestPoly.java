public class TestPoly {
	public static void main(String[] args) {
		Employee1 emp = new Employee1("John", 2500);
		Manager1 mgr = new Manager1("Peter", 3000, "HR");
		Director1 dir = new Director1("Xin", 5500, "", 2500);
		
		Employee1 arr[] = new Employee1[6];
		arr[0] = emp;
		arr[1] = mgr;
		arr[2] = dir;
		arr[3] = new Employee1("Jane", 2300);
		arr[4] = new Manager1("Mary", 3000, "MIS");
		arr[5] = new Director1("Siong", 2, "Management", 15);
		
		for (int cnt=0;cnt<arr.length;cnt++) {
			if (arr[cnt] instanceof Director1){//MUST use lowest to highest in order (or else will always output one in highest level
				System.out.println(cnt+": Director");
				
				//M1 - indirect method - create variable to get info from child
				Director1 direct = (Director1)arr[cnt];
				System.out.println(direct.profitSharing);
				
				//M2 - direct casting
				System.out.println("Profit sharing: "+((Director1)arr[cnt]).profitSharing);
				
				//Engineer1 eng = (Engineer1)arr[cnt];		//runtime error as can't directly cast to sibling
				//System.out.println(eng.name);

			}else if (arr[cnt] instanceof Manager1)
				System.out.println(cnt+": Manager");
			else
				System.out.println(cnt + ": Employee");
			
			
		}
		
	}

}
class Employee1 {
	String name;
	String birthDate;
	double salary;
	String hp;
	String email;
	Employee1(String name, double salary ) {
		System.out.println("employee constructor");
		this.name = name;
		this.salary = salary;
	}
	void sub() {
		System.out.println("in employee");
	}
	
}


class Manager1 extends Employee1{
	String department;
	double allowance;
	Manager1(String name, double salary, String department) {
		super(name, salary);
		System.out.println("manager constructors");
		this.department = department;
	}
	void sub() {
		System.out.println("in manager");
	}
	
	
}

class Engineer1 extends Employee1{
	Engineer1 (String name, double salary){
		super(name,salary);
	}
}

class Director1 extends Manager1{ 
	double profitSharing;
	Director1(String name, double salary, String department, double profitSharing){
		super(name, salary, department);
		this.profitSharing=profitSharing;
	}	
}