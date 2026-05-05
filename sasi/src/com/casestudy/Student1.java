package com.casestudy;
//(31-08-2025)
public class Student1 {
	int rollNo;
	String name;
	char grade;
	
	public Student1(int rollNo, String name, char grade) {
		
		this.rollNo = rollNo;
		this.name = name;
		this.grade = grade;
	}

	void display1() {
	
		System.out.printf("%-10s %-20s %-1s\n",rollNo,name,grade);
	}
}
