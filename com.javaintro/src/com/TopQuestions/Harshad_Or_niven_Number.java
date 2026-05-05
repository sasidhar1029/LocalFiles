package com.TopQuestions;

//27-11-2025
import java.util.Scanner;

//156 =1+5+6=12 --> 156%12=0 -->harshad number
public class Harshad_Or_niven_Number {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number");
			int a = sc.nextInt();
			int temp = a;
			int sum = 0;
			while (a != 0) {
				int d = a % 10;
				sum = sum + d;
				a = a / 10;
			}
			if (temp % sum == 0) {
				System.out.println("The given number is Harshad number:" + temp);
			} else {
				System.out.println("The given number is not a Harshad number:" + temp);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
