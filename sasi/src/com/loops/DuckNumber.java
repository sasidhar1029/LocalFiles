package com.loops;

import java.util.Scanner;

//Check if a number is Duck number or not.A number which has zeros present in it 
//ex: 402,280
public class DuckNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int m = n;
		int count = 0;
		while (n != 0) {
			int d = n % 10;
			if (d == 0)
			count ++;
			n = n / 10;
		}
		System.out.println(count);//if the question was how many zeros are there
		if (count > 0) {
			System.out.println("The given number is Duck number:" + m);
		} else {
			System.out.println("The given number is not a Duck nmber:" + m);
		}

	}

}
