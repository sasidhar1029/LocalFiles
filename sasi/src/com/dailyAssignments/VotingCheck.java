package com.dailyAssignments;

import java.util.Scanner;

public class VotingCheck {
	public static void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Invalid age you cant vote");
		} else {
			System.out.println("valid age you can vote");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		try {
			validateAge(age);
		} catch (InvalidAgeException e) {
			System.err.println(e.getMessage());
		}
	}
}
