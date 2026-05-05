package com.logicalStatements;

import java.util.Scanner;

public class MatrimonialWebsite {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("=== Welcome to Our Matrimonial Website! ===");
		System.out.println("Let's see if we are a match...\n");

		// Step 1: Salary & Assets
		System.out.println("--- Step 1: Salary & Assets ---");
		System.out.print("Enter your salary (INR): ");
		double salary = sc.nextDouble();
		System.out.print("Enter your assets (INR): ");
		double properties = sc.nextDouble();

		if (salary < 700000 || properties < 5000000) {
			System.out.println("Sorry, your salary or assets do not meet the criteria.");
			return;
		}
		System.out.println("Salary and assets criteria matched!\n");

		sc.nextLine(); // consume leftover newline

		// Step 2: Name
		System.out.println("--- Step 2: Personal Details ---");
		System.out.print("Enter your name: ");
		String name = sc.nextLine();

		// Step 3: Age
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		if (age < 24 || age > 28) {
			System.out.println("Sorry, your age does not match the profile.");
			return;
		}
		System.out.println("Age criteria matched!\n");

		// Step 4: Height
		System.out.print("Enter your height (ft): ");
		float height = sc.nextFloat();
		if (height < 5.6) {
			System.out.println("Sorry, you are too short.");
			return;
		} else if (height > 6.1) {
			System.out.println("Sorry, you are too tall.");
			return;
		}
		System.out.println("Height criteria matched!\n");

		// Step 5: Weight
		System.out.print("Enter your weight (kg): ");
		double weight = sc.nextDouble();
		if (weight < 60 || weight > 70) {
			System.out.println(weight < 60 ? "Sorry, you are too skinny." : "Sorry, you are too heavy.");
			return;
		}
		System.out.println("Weight criteria matched!\n");

		sc.nextLine(); // consume leftover newline

		// Step 6: Education
		System.out.print("Enter your highest education level (e.g., Bachelors, Masters, PhD): ");
		String education = sc.nextLine();
		if (!education.equalsIgnoreCase("Master") && !education.equalsIgnoreCase("PhD")
				&& !education.equalsIgnoreCase("B.tech") && !education.equalsIgnoreCase("Bachelors")) {
			System.out.println("Sorry, your education does not meet the profile requirements.");
			return;
		}
		System.out.println("Education criteria matched!\n");

		// Step 7: Religion
		System.out.print("Enter your religion: ");
		String religion = sc.next();
		sc.nextLine(); // consume leftover newline
		if (!religion.equalsIgnoreCase("Hindu")) {
			System.out.println("Sorry, religion criteria not matched.");
			return;
		}
		System.out.println("Religion criteria matched!\n");

		// Step 8: Hobbies
		System.out.print("Enter your hobbies (comma separated): ");
		String hobbies = sc.nextLine();
		if (!hobbies.toLowerCase().contains("reading")) {
			System.out.println("Sorry, hobbies criteria not matched.");
			return;
		}
		System.out.println("Hobbies criteria matched!\n");

		// Step 9: City
		System.out.print("Enter your city: ");
		String city = sc.next();
		sc.nextLine(); // consume leftover newline
		if (!city.equalsIgnoreCase("Hyderabad")) {
			System.out.println("Sorry, location criteria not matched.");
			return;
		}
		System.out.println("Location criteria matched!\n");

		// Step 10: Language
		System.out.print("Enter your preferred language: ");
		String language = sc.nextLine();
		if (!language.equalsIgnoreCase("Telugu")) {
			System.out.println("Sorry, language criteria not matched.");
			return;
		}
		System.out.println("Language criteria matched!\n");

		// Step 11: Siblings
		System.out.print("Do you have siblings? (yes/no): ");
		String siblingInput = sc.nextLine();
		boolean hasSiblings = siblingInput.equalsIgnoreCase("yes");
		if (!hasSiblings) {
			System.out
					.println("\n Congratulations " + name + "! You match all the criteria. We will contact you soon.");
		} else {
			System.out.println("Sorry, criteria not matched.");
		}
	}
}
