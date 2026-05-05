package com.practice;

import java.util.Scanner;

//Print sum of first N natural numbers
public class Print4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int sum=0;
         for(int i=1;i<=n;i++) {
        	 sum+=i;
         }
         System.out.println("sum::"+sum);
	}

}
