package com.practice;

public class BasicMethodcalling {
     static void main() {
    	 System.out.println("welcome to hyd");
    	 System.out.println("welcome to kphp");
    	 System.out.println("welcome to Vcube");
     }
	public static void main(String[] args) {
		System.out.println("main method started");
		BasicMethodcalling b2 =new BasicMethodcalling();
		main();
	      b2.hello();
		System.out.println("main method ended");
	}
	void hello() {
		System.out.println("hello guys");
	}

}
