package com.sasi;
import java.util.Scanner;
public class S25 {

	public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a marks:");
		int marks = s1.nextInt(); // You can change this value
		String grade;

		grade = (marks >= 90 && marks <= 100) ? "A" :
		        (marks >= 80 && marks < 90) ? "B" :
		        (marks >= 60 && marks < 80) ? "C" :
		        (marks >= 35 && marks < 60) ? "D" :
		        (marks < 35) ? "fail": "Invalid";

		System.out.println("Marks: " + marks);
		System.out.println("Grade: " + grade);
	}
}
