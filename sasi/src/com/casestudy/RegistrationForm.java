package com.casestudy;
// (31-08-2025)
public class RegistrationForm {
	String name;
	int age;
	String gender;
	RegistrationForm(String name,int age,String gender){
		this.name =name;
		this.age =age;
		this.gender =gender;
	}

	void display() {
		System.out.println("Registration form Details:");
		System.out.println("Name      :"+name);
		System.out.println("Age       :"+age);
		System.out.println("Gender    :"+gender);
	}
}
