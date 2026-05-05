package com.loops;

import java.util.Scanner;

//Print numbers from 1 to 10 using a for loop.
public class P10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print(i+" ");
		}

	}

}
