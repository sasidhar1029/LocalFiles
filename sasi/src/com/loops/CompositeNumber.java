package com.loops;

import java.util.Scanner;

//Find if a number is a compositeNumber or not .which has more than one factor(excl 1,n)
//ex:8=2,4=2 factors
public class CompositeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n =sc.nextInt();
		int count =0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count>3) {
			System.out.println("The given number is CompositeNumber:"+n);
		}else {
			System.out.println("The given number is not a CompositeNumber:"+n);
		}

	}

}
