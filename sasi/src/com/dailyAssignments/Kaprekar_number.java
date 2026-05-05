package com.dailyAssignments;

import java.util.Scanner;

public class Kaprekar_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a =sc.nextInt();
		int square =a*a;
		System.out.println("Squre of given number:"+square);
		int b=square/100;
		int c =square%100;
		int d =b+c;
		System.out.println(b);
		System.out.println(c);
		System.out.println("The sum of square split number is:"+d);
	  if(a==d) {
		  System.out.println(" The given number is Kaprekar number"+a);
		 
	  }else {
		  System.out.println("The given number is not a kaprekar number"+a);
	  }

	}

}
