package com.casestudy;

public  class Student extends Person {
	private int rollNumber;
	private String grade;
	
	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	void displayDetails() {
		System.out.println(rollNumber);
		System.out.println(grade);
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(getAddress());
		System.out.println("************************");
	}
	
}
