package com.dailyAssignments;

import java.util.Scanner;

public class Smith_number {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		int sum =0;
		System.out.println(sum);
	     for(int i=1;;i++) {
	    	 int r =a%10;
	    	  sum +=i;
	     }
	}
}
