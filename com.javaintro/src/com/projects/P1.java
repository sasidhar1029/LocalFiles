package com.projects;

import java.util.Scanner;

public class P1 {
	public static final String USERNAME = "sasidhar";
	public static final String PASSWORD = "sasi@123";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		String username = sc.nextLine().trim();
		System.out.println("Enter password");
		String password = sc.nextLine().trim();
		if (isvalidUser(username, password)) {
			System.out.println("welcome to the dashboard");
		} else {
			System.err.println("invalid password or username.please try again");
		}

	}

	private static boolean isvalidUser(String username, String password) {
		return USERNAME.equalsIgnoreCase(username) && PASSWORD.equals(password);
	}

}
