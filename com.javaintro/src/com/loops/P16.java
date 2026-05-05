package com.loops;

//Calculate the factorial of a given number (e.g., 5! = 120).
public class P16 {

	public static void main(String[] args) {
		int number = 100;
		int fac = 1;
//		int count = 0;
		for (int i = 1; i <= number; i+=2) {
			fac = fac * i;

		}
		System.out.println(fac);

	}
}
