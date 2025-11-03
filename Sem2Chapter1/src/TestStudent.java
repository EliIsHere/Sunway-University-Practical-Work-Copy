
public class TestStudent {
	public static void main(String[] args) {
	   Student stu = new Student();
	   
	   stu.name = "Joe";
	   stu.age = 21;
	   
	   stu.display();
	   stu.changeName("John");
	   stu.display();
		
	}
}

class Student {//class can be nested, however method can't be nested in a method (but can nested in class)
	int age;
	String name;
	
	void display () {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	void changeName (String name) {
		this.name = name;
	}
}