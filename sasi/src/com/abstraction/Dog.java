package com.abstraction;

public class Dog implements Animal {

	public static String dogname="rocky";
	@Override
	public void sound() {
	  System.out.println("Bow Bow...");
		
	}

	@Override
	public void walk() {
		System.out.println("dog can walk and run like anything");
		
	}

	@Override
	public void eat() {
		System.out.println("Dog can eat meat!");
		
	}

}
