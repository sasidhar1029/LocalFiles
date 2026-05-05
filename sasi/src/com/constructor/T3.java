package com.constructor;

public class T3 {
	int eid;
	String ename;
	double esal;

	public static void main(String[] args) {
		T3 t = new T3();
		t.display();
	}

	void display() {
		System.out.println("eid:" + eid);
		System.out.println("ename:" + ename);
		System.out.println("esal:" + esal);
	}

}
