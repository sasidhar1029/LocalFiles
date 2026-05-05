package com.javaintro;
import java.util.Scanner;


public class Day34 {
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter employee name:");
		String employeeName = sc.next();
		System.out.println("enter years of experience");
	
	int yearsOfExperience = sc.nextInt();
	if(yearsOfExperience<=0) {
		System.out.println("invalid experience:");
	}else {
	
		
	if (yearsOfExperience > 0 && yearsOfExperience <= 1) {
		System.out.println("0");
	}
	if (yearsOfExperience >= 2 && yearsOfExperience <= 4) {
		System.out.println("5,000");
	}
	if (yearsOfExperience >= 5 && yearsOfExperience <= 9) {
		System.out.println("10,000");
	}
	if (yearsOfExperience >= 10) {
		System.out.println("20,000");
	}

	}

	}

}
