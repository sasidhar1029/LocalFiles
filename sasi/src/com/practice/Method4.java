package com.practice;

import java.util.Scanner;

public class Method4 {
	static void add(float f1,float f2) {
		float sum = f1+f2;
		System.out.println("sum of two numbers:"+sum);
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		float a=sc.nextFloat();
		System.out.println("enter b number");
		float b = sc.nextFloat();
		add(a,b);
		System.out.println("main method ended");
	}

}
