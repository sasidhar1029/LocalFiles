//Write a Java program that takes a number from 
//the user and generates an integer between 1 and 7. It displays the weekday name.
package com.loops;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a day:");
		 int day = sc.nextInt();
		 String dname ="";
		 
		 switch(day) {
		 case 1 -> dname ="monday";
		 case 2  -> dname = "tuesday";
		 case 3 -> dname ="wednesDay";
		 case 4 -> dname ="thrusday";
		 case 5  -> dname ="friday";
		 case 6 -> dname ="saturday";
		 case 7 -> dname = "sunday";
		 default -> dname ="invalid day";
		 
		 }
		 System.out.println(dname);

	}

}
