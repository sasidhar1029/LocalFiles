package com.sasi;
import java.util.Scanner;
public class S10 {
  static  Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		S10 se = new S10();
	    double salary = se.getEmployeeSalary();
	  double bonus = se.getEmployeeBonusInfo();
	  System.out.println("Employee total salary:"+(salary+bonus));

	}
	static   double getEmployeeBonusInfo() {
		System.out.println("Enter bonus info:");
		 double bonus = sc.nextDouble();
		 return bonus;
	}
       static double getEmployeeSalary() {
		System.out.println("enter salary info:");
		double salary = sc.nextDouble();
		return salary;
		
       }

}
 