package Synatax_and_variables;

import java.util.Scanner;

public class FInd_area_perimeter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a length");
		double l =sc.nextDouble();
		
		System.out.println("Enter a breadth");
		double b= sc.nextDouble();
		
		double area = l*b;
		double perimeter =2*(l*b);
		System.out.printf("area of Rectangle:%.3f%n",area);
		
		System.out.printf("Perimeter of Rectangle:%.2f%n" ,perimeter);
		}

}
