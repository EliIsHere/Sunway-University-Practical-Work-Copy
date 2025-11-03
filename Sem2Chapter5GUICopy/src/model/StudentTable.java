package model;

import controller.Validation;

public class StudentTable {
	private String name;
	private int age;
	private String gender;
	private int no;

	public StudentTable(int no,String name, int age, String gender) {
		setNo(no);
		setName(name);
		setAge(age);
		setGender(gender);		
	}
	
	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		if (no>0)
			this.no=no;
		else 
			this.no=0;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = Validation.isValidName(name)?name:null;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = Validation.isValidAge(age)?age:0;		
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender=Validation.isValidGender(gender)?gender:null;
	}
	

	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}