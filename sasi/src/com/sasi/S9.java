package com.sasi;
import java.util.Scanner;
public class S9{
  static Scanner se = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("main method statred");
		S8 sc = new S8();
		 int sum = sc.addition();
		 String name =sc.getName();
		 char c = sc.getGen();
		int sub =sc.sub();
		System.out.println("addition:"+sum);
		System.out.println("name:"+name);
		System.out.println("character:"+c);
		System.out.println("subtraction:"+sub);
		
		System.out.println("main method ended");

	}
	int addition() {
		int sum = 0;
		
		return sum;
	}
	String getName() {
		System.out.println("Enter your name:");
		 String name=se.next();
	
		 return name;
	}
	char getGen() {
	
		return 'M';
	}
	int sub() {
		return 100-90;
	}

}
