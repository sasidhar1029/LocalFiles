package Synatax_and_variables;

import java.util.Scanner;

public class Convert_temperature {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a celsius");
		double c= sc.nextDouble();
		
		double f= (c*9/5)+32;
		System.out.println("Fahrenheit:"+f);
	}

}
