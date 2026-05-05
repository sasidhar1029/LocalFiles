package com.StringHandling;

import java.util.Scanner;

public class S12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		String uname = sc.next();
		System.out.println("Enter password");
		String pass = sc.next();
		if (uname.equalsIgnoreCase("admin") && pass.equals("admin#123")) {
			System.out.println("welcome admin successfully login into your account");
		} else {
			System.err.println("Invalid user credentials");
		}
	}

}
