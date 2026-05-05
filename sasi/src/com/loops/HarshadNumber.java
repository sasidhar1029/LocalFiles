package com.loops;

import java.util.Scanner;

//check if number is Niven/HarshadNumber or not.A number which is divisible by the sum of its 
//digit .. ex:156 => 1+5+6 =12
public class HarshadNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int m = n;
		int sum =0;
		while(n!=0) {
			int d = n%10;
			sum+=d;
			n =n/10;
		}
		if(m%sum==0) {
			System.out.println("The given number is Harshad number :"+m);
		}else {
			System.out.println("The given number is not a Harshad number : "+m);
		}
	}

}
