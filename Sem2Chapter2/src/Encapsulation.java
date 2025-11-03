public class Encapsulation {
	public static void main(String[] args) {
		Student stud = new Student();
		//	stud.age = -5;
		//stud.gender ='k';
		//	stud.name = "%s#-j";

		/*stud.setAge(-5);
		System.out.println(stud);*/

		stud.setAge(22);
		stud.setName("%s#-j");
		stud.setGender('k');
		System.out.println(stud);

	}
}

class Student {
	private int age;
	private char gender;
	private String name;

	public int getAge(){

		return age;
	}

	public void setAge(int age){
		if (age>=20 && age<=50)
			this.age=age;
		else
			System.out.println("invalid age");

	}

	public char getGender() {
		return gender;
	}

	public boolean setGender(char gender) {//F,f,M,m
		switch (gender) {
		case 'F', 'f', 'M', 'm':this.gender=gender;
		return true;

		default: return false;
		}
	}

	public String getName() {
		return name;
	}

	public boolean setName(String name) {
		char ch = ' ';
		int len = name.length();
		for(int cnt=0; cnt<len; cnt++) {
			ch = name.charAt(cnt);
			if (Character.isLetter(ch)||Character.isWhitespace(ch));
			else
				return false;
		}
		this.name = name;
		return true;
	}

	public String toString() {
		return "Student [age=" + age + ", gender=" + gender + ", name=" + name + "]";
	}
}


