package com.loops;

import java.util.Scanner;

//Write a Java program to get a number from the user
//and print whether it is positive or negative.
public class P2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number1");
		  int num1 = sc.nextInt();
		  System.out.println("enter a number2");
		  int num2 = sc.nextInt();
		  System.out.println("enter a number3");
		  int num3 = sc.nextInt();
		  
		  if(num1>num2 && num1>num3) {
			  System.out.println("num1 is bigger:"+num1);
		  }else if(num2>num1 && num2>num3) {
			  System.out.println("num2 is bigger:"+num2);
		  }else if(num3>num1 && num3>num2) {
			  System.out.println("num3 is bigger:"+num3);
		  }else {
			  System.out.println("invalid number");
		  }
		  
		  
	}

}
