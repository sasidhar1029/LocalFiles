package com.casestudy;

public class Teacher extends Person {
	private int employeeId;
	private String subject;
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	void displayDetails() {
		System.out.println(employeeId);
		System.out.println(subject);
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(getAddress());
		System.out.println("*****************");
	}
	
}
