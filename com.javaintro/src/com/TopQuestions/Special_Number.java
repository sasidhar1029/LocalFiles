package com.TopQuestions;
//27-11-2025
import java.util.Scanner;

// 59 =5+9+5*9 -->special number
public class Special_Number {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number");
			int a = sc.nextInt();
			int m = a;
			int sum = 0;
			int prod = 1;
			while (a != 0) {
				int d = a % 10;
				sum = sum + d;
				prod = prod * d;
				a = a / 10;
			}
			if (sum + prod == m) {
				System.out.println("The given number is special number:" + m);
			} else {
				System.out.println("The given number is not a special number:" + m);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
