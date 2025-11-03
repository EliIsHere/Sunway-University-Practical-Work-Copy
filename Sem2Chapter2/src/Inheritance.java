public class Inheritance {
	public static void main(String[] args) {
		Employee emp  =new Employee();		//normal class objects
		
		Employee em = new Manager();		//poly-morphic object (in this case call manager but use stuff from employee)
		em.name = "john";
		em.salary = 1000;
		em.sub();//will call manager class to get stuff from manager instead of employee
		//em.department = "HR";		//syntax error
	}
}

class Employee {

   String name;
   String birthDate;
   double salary;
   String hp;
   String email;
   

   void sub() {
	   System.out.println("one");
   }


public char[] getDetails() {
	// TODO Auto-generated method stub
	return null;
}
}

class Manager extends Employee {
     String department;
     double allowance;
     void sub() {
    	 System.out.println("two");
     }
	//public Manager(String name, String birthDate, double salary, String hp, String email, String department, double allowance) {
		//super();
		//this.department = department;
		//this.allowance = allowance;
	//}
     
     
}

class Secretary extends Employee {
	void sub() {
		System.out.println("three");
	}
}


class Engineer extends Employee {
	void sub() {
		System.out.println("four");
	}
 
}

