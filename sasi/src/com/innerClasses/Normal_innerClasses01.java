package com.innerClasses;

public class Normal_innerClasses01 {
	private String name = "hello outer users";

	public static void main(String[] args) {
		System.out.println("outer main method");
		new Normal_innerClasses01().new N1().display();

		Normal_innerClasses01.N1 n1 = new Normal_innerClasses01().new N1();
		n1.display();

		Normal_innerClasses01 n2 = new Normal_innerClasses01();
		Normal_innerClasses01.N1 n3 = n2.new N1();
		n3.display();
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
