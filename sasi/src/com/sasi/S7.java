package com.sasi;

import java.util.Scanner;
public class S7 {
      static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		addition(10, 20, 65);
		subtraction(100.6, 150.7);
		multiplication(10,10,10);
		division(49,9);
		modulus(487,6);
	}

  static void modulus(int i, int j) {
	System.out.println("modulus:"+i%j);
	
}

static void division(int i, int j) {
	System.out.println("division"+i/j);
	
}

static void multiplication(int i, int j, int k) {
System.out.println("multiplication:"+i*j*k);
	
}

	static void subtraction(double d, double e) {
		System.out.println("subtraction"+ (d - e));

	}

	static void addition(int i, int j, int k) {
		System.out.println("Addition:"+(i + j + k));

	}

}
