package com.abstraction;
     //cat is animal(is a realtionship)
public class Cat  implements Animal{
	//every methods of Animal interface should implement in a cat class 
	//it must be public 
	@Override
	public void sound() {
		System.out.println("Meow Meow!!!!");
	}
	
	@Override
	public void walk() {
		System.out.println("cat walk....");
	}
	
	@Override
	public void eat() {
		System.out.println("cat can eat rat....");
	}

}
