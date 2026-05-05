package com.TopQuestions;

import java.util.Scanner;

public class Decimal_to_binary {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number");
			int a = sc.nextInt();
			int temp = a;
			String binary = "";
			while (a != 0) {
				int rem = a % 2;
//				Because binary digits are read in reverse order.
//				Example: For 10 → remainders come as 0,1,0,1
//				Final binary must be 1010, so we add remainders at front.
				binary = rem+binary ;
				a = a / 2;
			}
			System.out.println("binary of:" + temp + " = " + binary);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
