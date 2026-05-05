package com.abstraction;

public class TestAnimal {
//Driver class
	public static void main(String[] args) {
	 System.out.println("welcome to animal park!");
	 
	 System.out.println("Cat object info----------");
	 Animal c = new Cat();
	 System.out.println(Animal.name);
	 c.sound();
	 c.eat();
	 c.walk();
  
	 System.out.println("Dog object info--------------");
	 Animal d = new Dog(); 
	 System.out.println(Dog.dogname);
	 d.eat();
	 d.sound();
	 d.walk();
	 }

}
