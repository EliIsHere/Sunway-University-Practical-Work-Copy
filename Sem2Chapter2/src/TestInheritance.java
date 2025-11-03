public class TestInheritance {
	public static void main (String args[]) {
		Employee emp = new Employee();
		emp.name = "john";
		emp.salary = 1000;
		emp.birthDate = "20/04/1980";
		emp.hp = "54678908076";
		emp.email = "ufwehfihweoifh";
		
		System.out.println(emp.getDetails());

		Manager mgr = new Manager();
		mgr.name = "Mary";
		mgr.salary = 4000;
		mgr.department = "MIS";
		mgr.birthDate = "14/05/1965";
		mgr.hp = "54609898766";
		mgr.email = "ufihweoifh";

		System.out.println(mgr.getDetails());

		Secretary s = new Secretary();
		s.name = "Jane";
		s.salary = 800;
		s.birthDate = "6/10/1988";
		s.hp = "546787968576";
		s.email = "ufweyuiifh";

		System.out.println(s.getDetails());

		Engineer e = new Engineer();
		e.name = "Alex";
		e.salary = 2000;
		e.birthDate = "22/05/1976";
		e.hp = "5879008076";
		e.email = "uoioioioifh";

		System.out.println(e.getDetails());

	}
}