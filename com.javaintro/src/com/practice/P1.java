package com.practice;

public class P1 {
	String name;
	int age;
	double salary;

	P1(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	void method1() {

		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Salary:" + salary);
		System.out.println("**************************");

	}

	public static void main(String[] args) {
		P1 p = new P1("sasi", 12, 100000);
		p.method1();
		P1 p2 = new P1("subbu", 13, 150000);
		p2.method1();
		P1 p3 = new P1("vamsi", 14, 160000);
		p3.method1();
		P1 p4 = new P1("snanke raj", 2, 222222);
		p4.method1();
		P1 p5 = new P1("surya", 19, 50000);
		p5.method1();

	}

}