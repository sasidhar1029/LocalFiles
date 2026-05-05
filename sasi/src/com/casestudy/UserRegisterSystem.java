package com.casestudy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserRegisterSystem {

	public static void main(String[] args) {

		List<String> registerNames = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter a user name");
			String newUser = sc.nextLine();
			if (newUser.equalsIgnoreCase("exits")) {
				System.out.println("Existing registration system");
				return;
			}
			boolean exits = false;
			for (String user : registerNames) {
				if (user.equalsIgnoreCase(newUser)) {
					exits = true;
					break;
				}
			}

			if (exits) {
				System.out.println("username already exits");
			} else {
				registerNames.add(newUser);
				System.out.println("user register successfully");
			}
		}
//		System.out.println("All register userName");
//		for (String user : registerNames) {
//			System.out.println(user);
//		}
	}

}
