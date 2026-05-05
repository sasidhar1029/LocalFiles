package com.practice;

public class TyoesofVar {
	int studentId = 9;
	String studentName = "srikanth";
	static int collegeId = 555;
	static String clgName = "Vcube";

	void show() {
		System.out.println(collegeId);
		System.out.println(clgName);
		System.out.println(studentName);
		System.out.println(studentId);
		System.out.println("*******************");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		TyoesofVar t1 = new TyoesofVar();
		t1.show();
		String name = "suresh";
		System.out.println(name);
		System.out.println(collegeId);
		System.out.println(clgName);
		System.out.println(t1.studentId);
		System.out.println(t1.studentName);
		System.out.println("main method ended");
	}

}
