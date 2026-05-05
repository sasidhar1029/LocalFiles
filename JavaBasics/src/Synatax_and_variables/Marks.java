package Synatax_and_variables;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		for (int i = 1; i <= 5; i++) {
			total += sc.nextInt();
		}
		double percentage = total / 5;
		char grade = percentage >= 90 ? 'A'
				: percentage >= 75 ? 'B' : percentage >= 60 ? 'C' : percentage >= 40 ? 'D' : 'F';
		System.out.println("Total:" + total);
		System.out.println("percentage:" + percentage);
		System.out.println("Grade:" + grade);

	}

}
