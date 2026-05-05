package com.practice;

import java.util.Scanner;

//Print factorial of a number
public class Print9 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
        int n =sc.nextInt();
        int fac =1;
        for(int i=n;i>=1;i--) {
        	fac*=i;
        }
        System.out.println(fac);
	}

}
