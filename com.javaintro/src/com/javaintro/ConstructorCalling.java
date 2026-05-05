package com.javaintro;

 class ConstructorCalling1 {
	int a;
	String name;
	int age;

	ConstructorCalling1() {
		this(20);
		System.out.println("no arg");
	}

	ConstructorCalling1(int a) {
		this(20, "arjun");
		this.a = a;
	}

	ConstructorCalling1(int a, String name) {
		this(20, "arjun", 21);
		this.a = a;
		this.name = name;
	}

	ConstructorCalling1(int a, String name, int age) {

		this.a = a;
		this.name = name;
		this.age = age;
	}
	void show() {
		 System.out.println(a);
		 System.out.println(name);
		 System.out.println(age);

}
	
	
}

 public class ConstructorCalling {
		public static void main(String[] args) {
			ConstructorCalling1 n1 = new ConstructorCalling1();
			n1.show();

		}

		
		}
