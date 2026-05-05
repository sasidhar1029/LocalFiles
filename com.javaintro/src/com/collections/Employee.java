package com.collections;

public class Employee {
	int empid;
	String empname;
	double empsal;
	long phone;

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + ", phone=" + phone + "]";
	}

	public Employee(int empid, String empname, double empsal, long phone) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
		this.phone = phone;
	}

	public static void main(String[] args) {
		
	}


}
