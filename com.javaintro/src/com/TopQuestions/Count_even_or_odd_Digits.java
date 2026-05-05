package com.TopQuestions;
//27-11-2025
import java.util.Scanner;

public class Count_even_or_odd_Digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a number");
			int a = sc.nextInt();
			int evenCount = 0;
			int oddCount = 0;
			while (a != 0) {
				int d = a % 10;
				if (d % 2 == 0) {
					evenCount++;
				} else {
					oddCount++;
				}
				a = a / 10;
			}
			System.out.println("Even digits count:" + evenCount);
			System.out.println("Odd digits count:" + oddCount);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
