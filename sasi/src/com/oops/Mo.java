package com.oops;

public class Mo {

	int method() {
		int a = 10;
		int b = 20;
		return a + b;
	}

	double method(double c) {
		return c * c;
	}

	String method(String d, String e) {
		return d + e;
	}

	public static void main(String[] args) {
		Mo m = new Mo();
		System.out.println(m.method());
		System.out.println(m.method(20.0));
		System.out.println(m.method("sasi", "dhar"));

	}

}
