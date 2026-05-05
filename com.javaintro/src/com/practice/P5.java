package com.practice;

public class P5 {

	public static void main(String[] args) {
		int a = 8;
		int b = 10;
		System.out.println("A:" + a);
		System.out.println("B:" + b);
//		a = a ^ b ^ (b = a);
//		int temp = a;
//		a = b;
//		b = temp;
		a =a+b;
		a=a-a;
		b=b-a;
		System.out.println("A:" + a);
		System.out.println("B:" + b);

	}

}
