package com.loops;

import java.util.Scanner;

//check if a number is palindrome or not
//ex:121,24642 or 3553
public class Palnidrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int m = n;
		int sum = 0;
		while (n != 0) {
			int d = n % 10;
			sum = sum * 10 + d;
			n = n / 10;
		}
		//here we compare with m not a n because n will be zero after looping
		if(sum==m) {
			System.out.println("The given number is palindrome:"+m);
		}else {
			System.out.println("The given number is not a palindrome:"+m);
		}
	}

}
