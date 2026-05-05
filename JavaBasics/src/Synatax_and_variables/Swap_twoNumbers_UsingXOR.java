package Synatax_and_variables;

import java.util.Scanner;

public class Swap_twoNumbers_UsingXOR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Before Swapping:" + "a:" + a + "B:" + b);

		a = a ^ b;
		b = b ^ a;
		a = a ^ b;
		System.out.println("A:" + a);
		System.out.println("B:" + b);
	}

}
