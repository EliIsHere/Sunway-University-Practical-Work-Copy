import java.util.*;
public class Encapsulation2 {
	public static void main(String[] args) {
		Encapsulation2 e2 = new Encapsulation2();
				e2.userInput();
	}
	
	void userInput() {
		Scanner scan = new Scanner(System.in);
		String name = null;
		boolean validName = false;
		do {
			System.out.println("Enter a name: ");
			name = scan.nextLine();
			if (!Validation.isNameValid(name)) {
				System.out.println("Invalid name. please re-enter");
				validName = false;
			}
		}while (!validName);
	}
}


class Validation {
	static boolean isNameValid(String name) {
		char ch=' ';	
		int len = name.length();
		for (int cnt=0; cnt<len; cnt++) {
			ch = name.charAt(cnt);
			if (Character.isLetter(ch) || Character.isWhitespace(ch))
				;
			else
				return false;
		}
		return true;
	}
	
	static boolean isAgeValid (int age) {
		if (age>=20 && age<=50)
			return true;
		else
			return false;		
	}
}


class Person {
	String name;
	int age;
	public Person(String name, int age) {
		setName(name);
		setAge(age);
	}
	public String getName() {
		return name;
	}
	public boolean setName(String name) {
		if(Validation.isNameValid(name))
			this.name = name;
		else 
			return false;
		return true;
	}
	public int getAge() {
		return age;
	}
	public boolean setAge(int age) {
		if (Validation.isAgeValid(age))
		this.age = age;
		else
			return false;
		return true;
	}
	
}
