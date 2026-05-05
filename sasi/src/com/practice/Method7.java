package com.practice;

import java.util.Scanner;

public class Method7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rate = 50;
		int totalIncome =0;
		System.out.println("Enter number of cutomers :");
		int customers = sc.nextInt();
		
		for (int i = 1; i <= customers; i++) {
			System.out.println("customers" + i);
			System.out.println("Enter number of bikes:");
			int bikes = sc.nextInt();
			int customerBill = 0;
			int j = 1;
			
			while(j<=bikes) {
				System.out.println("Enter hours for bike:"+j);
				int hours =sc.nextInt();
				int bikeCharge = rate*hours;
				if(hours>5) {
					bikeCharge -=(bikeCharge *10/100);
				}
				customerBill +=bikeCharge;
			j++;
			}
			
			System.out.println("customer"+i+"Bill:"+customerBill);
			totalIncome +=customerBill;
		}
		System.out.println("Total income for the day:"+totalIncome);
		}
	
}
