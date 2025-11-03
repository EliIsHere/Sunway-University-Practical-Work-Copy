
public class AbstractClass {
	public static void main(String[] args) {
		Employee emp = new Employee("John");
		Manager mgr = new Manager("Peter", 4000);
		Secretary sec = new Secretary("Lisa");
		
		
		Employee arr[] = new Employee[5];
		arr[0] = new Manager("Kimmy", 2500);
		arr[1] = new Secretary ("Lin");
		arr[2] = new Employee("Penny");  //syntax error
		arr[3]  = new Manager("Lim", 3750);
		arr[4] = new Secretary("Sam");
	}
}

class Employee {
	private String name;
	Employee(String name) {
		this.name = name;
	}

	public String toString() {
		return "name: " + name;
	}
}
class Manager extends Employee {
	private double allowance;
	Manager (String name, double allowance){
		super(name);
		setAllowance(allowance);
	}
	boolean setAllowance(double allowance) {
		if (allowance>0)
		   this.allowance = allowance;
		else
			return false;
		return true;
	}
	public String toString() {
		return super.toString() + String.format(", allowance:RM%.2f",  allowance);
	}
	
}
class Secretary extends Employee{
	Secretary (String name){
		super(name);
	}
	public String toString() {
		return super.toString(); 
	}
}