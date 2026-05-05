package com.whileloop;

//import java.util.Scanner;

//write a program to print form 2 to n as a customer incres 2;
public class Whlile_loop1 {

	public static void main(String[] args) {
	
	
	}
	static void isArmStrong(int n) {
		int number = 153;
		int temp =n;
		int sump=0;
		int r=0;
		String digits=Integer.toString(n);
		int digitsL =digits.length();
		for(int i=1;i<=number;i++) {
			r=number%10;
			number/=10;
			sump+=(int)Math.pow(r, digitsL);
		}
	}
}
