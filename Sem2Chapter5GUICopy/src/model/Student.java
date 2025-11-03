package model;

import controller.Validation;

public class Student {
	private String name;
	private int age;
	private String gender;

	public Student(String name, int age, String gender) {
		setName(name);
		setAge(age);
		setGender(gender);		
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