package com.loops;

import java.util.Scanner;

//Check if a number is a special number or not.sum of digits plus product of
//digits it is equal to original number
//ex: 59 => 5+9+5*9
public class SpecialNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int m = n;
		int sum =0;
		int prod =1;
		while(n!=0) {
			int d = n%10;
			sum +=d;
			prod *=d;
			n =n/10;
		}
		if(sum+prod ==m) {
			System.out.println("The given number is Special number: "+m);
		}else {
			System.out.println("The given number is not a Special number:"+m);
		}
	}

}
