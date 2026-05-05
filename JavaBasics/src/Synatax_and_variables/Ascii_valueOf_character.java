package Synatax_and_variables;

import java.util.Scanner;

public class Ascii_valueOf_character {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character:");
		char ch = sc.next().charAt(0);
		System.out.println("ASCII value =" + (double)ch);
	}

}
