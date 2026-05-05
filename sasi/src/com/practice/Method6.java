package com.practice;

import java.util.Scanner;

public class Method6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		boolean num =checkEvenOrNot(a);
		if(num) {
			System.out.println("The given number is even:"+num);
		}else {
			System.out.println("The given number is odd:"+num);
		}
	}

	static boolean checkEvenOrNot(int a) {
		boolean status =false;
		if(a%2==0) {
			status=true;
		}
		return status;
	   
	}

}
