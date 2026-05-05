//Write a Java program that reads two floating-point 
//numbers and tests whether they are the same up to three decimal places.
package com.loops;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a floating number 1 :");
		float f1 =sc.nextFloat();
		System.out.println("enter a floating number 2:");
		float f2 = sc.nextFloat();
		
		if(f1==f2) {
			System.out.println("both are same");
		}else {
			System.out.println("both are not same");
		}
	}

}
