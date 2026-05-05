package com.TopQuestions;

import java.util.Scanner;

//27-11-2025
public class Binary_to_Decimal {

	public static void main(String[] args) {
		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number");
			int s = sc.nextInt();
			int temp = s;
			int decimal = 0;
			int position = 0;
			while (s != 0) {
				int d = s % 10;
				decimal = (int) (decimal + d * Math.pow(2, position));
				position++;
				s = s / 10;
				
			}
			System.out.println("Decimal of" + temp + " = " + decimal);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
