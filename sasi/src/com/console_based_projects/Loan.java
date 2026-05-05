package com.console_based_projects;

import java.util.Scanner;

public class Loan {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
	}
	double getSalInfo() {
		System.out.println("enter your salary:");
		double sal = sc.nextDouble();
		return sal;
	}

	String getAddreddDetails() {
		String address = "";
		System.out.println("Enter your flot no:");
		String flot = sc.next();

		System.out.println("Enter your plot details:");
		String plot = sc.next();
		address = "Flot" + flot + "Plot" + plot;
		return address;
	}

	double getROI() {
		double roi = 10.5;
		return roi;
	}

	int getCibilScore() {
		System.out.println("enter your cibil score:");
		int cibil = sc.nextInt();
		return cibil;
	}
	Object method1() {
		return "loan";
	}
	int method2(int i) {
		return 200*i;
	}
}
