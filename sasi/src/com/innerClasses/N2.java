package com.innerClasses;

public class N2 {
	private String name = "hello outer users";

	public static void main(String[] args) {
		System.out.println("outer main method");
		new N2().new N1().display();
	}

	class N1 {
		public static void main(String[] args) {
			System.out.println("inner main method");
		}

		void display() {
			System.out.println(name);
		}
	}

}
