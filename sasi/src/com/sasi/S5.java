package com.sasi;

import java.util.Scanner;

public class S5{

	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		System.out.println("Employee salary:");
		double sal = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter your fisrt name:");
		String fnm = sc.nextLine();
		System.out.println("Enter gender info:");
		char c = sc.next().charAt(0);
		System.out.println("Enter employee id");
		int id = sc.nextInt();
		System.out.println("Enter your mobile number");
		long phone = sc.nextLong();
		
		

		getEmpName(fnm);
		getEmpId(id);
		empGen(c);
		emSal(sal);
		emPhone(phone);
	}

	static void emPhone(long phone) {

		System.out.println("Employee phone number:" + phone);
	}

	static void emSal(double sal) {
		System.out.println("Employee salary:" + sal);

	}

	static void getEmpId(int id) {
		System.out.println("Employee id" + id);

	}

	private static void empGen(char c) {
		System.out.println("employee gender:" + c);
	}

	static void getEmpName(String name) {
		System.out.println("Employee Name:" + name);

	}

}
