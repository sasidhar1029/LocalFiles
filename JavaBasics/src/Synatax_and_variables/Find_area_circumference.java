package Synatax_and_variables;

import java.util.Scanner;

public class Find_area_circumference {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double pi=3.14159;
		System.out.println("Enter a radius");
		double r =sc.nextDouble();
		
		System.out.printf("Area of circle:%.2f%n",(pi*r*r));
		System.out.printf("Circumference:%.2f%n",(2*pi*r));
	}

}
