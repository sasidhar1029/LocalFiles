package com.innerClasses;

abstract class Animal {
	abstract void sound();
}

interface vehicle {
	abstract void getName();
}

public class Anonymous_innerClass {

	public static void main(String[] args) {
		vehicle c = new vehicle() {

			@Override
			public void getName() {
				System.out.println("vehicle name is kia ");

			}
		};
		c.getName();
		Animal a = new Animal() {

			@Override
			void sound() {
				System.out.println("Mewo meow");

			}

		};
		a.sound();
	}

}
