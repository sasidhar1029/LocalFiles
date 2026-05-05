package com.innerClasses;

public class Static_innerClass {
	static class S1 {
		void show() {
			System.out.println("called static class");
		}
	}

	public static void main(String[] args) {
		System.out.println("main method stared");
		// 1st way
//		S1 s = new S1();

		// 2nd way
		Static_innerClass.S1 s2 = new Static_innerClass.S1();
//		s2.show();
//		s.show();

		// 3rd way
		new S1().show();

	}
}
