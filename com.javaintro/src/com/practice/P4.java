package com.practice;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter maths marks:");
		int maths = sc.nextInt();
		System.out.println("Enter science marks:");
		int science = sc.nextInt();
		System.out.println("Enter social marks");
		int social = sc.nextInt();
		double avg = (maths + science + social) / 3;
		System.out.println("Average marks:" + avg);

	}

}
