package com.dailyAssignments;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int num= sc.nextInt();
		boolean status = isArmstrong(num);
     if(status) {
    	 System.out.println("the given number is armstrong:"+num);
     }else {
    	 System.out.println("the given number is not a armstrong:"+num);
     }
	}

	static boolean isArmstrong(int n) {
		boolean status = false;
		int r =0;
		int temp =n;
		int sumP =0;
		String digits = Integer.toString(n);
		int digitLength = digits.length();
		while(n!=0) {
			r = n%10;
			n =n/10;
			sumP +=(int)Math.pow(r, digitLength);
		}
		if(temp==sumP) {
			return true;
		}
		return status;
	}

}
