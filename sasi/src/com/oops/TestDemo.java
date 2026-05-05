package com.oops;

public class TestDemo {

	public static void main(String[] args) {
		TestDemo t = new TestDemo();
		t.getArea();
//		t.getArea(12.00);
		System.out.println(t.getArea(12,33));

	}

	void getArea() {
		System.out.println("no arg ");
	}

	void getArea(int a) {
		System.out.println("with 1 arg int");
	}

	void getArea(long a) {
		System.out.println("with 1 arg long");
	}

	void getArea(float a) {
		System.out.println("with 1 arg float");
	}

	void getArea(double a) {
		System.out.println("with 1 arg double");
	}

//	int getArea(int a, int b) {
//		return a + b;
//	}

	long getArea(int a, long b) {
		return a + b;
	}

	long getArea(int a, float b) {
		return a;
	}
	double getArea(int a,double b) {
		return a*b;
	}
	float getArea(float a,float b) {
		return a+b;
	}
}
