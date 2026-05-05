package Synatax_and_variables;

import java.util.Scanner;

public class Largest_and_Smallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int Largest = a > b ? (a > c ? a : c) : (b > c ? b : c);
		int Smallest = a < b ? (a < c ? a : c) : (b < c ? b : c);
		System.out.println("Largest:" + Largest);
		System.out.println("Smallest:" + Smallest);
	}

}
