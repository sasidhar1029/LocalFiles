package Synatax_and_variables;

public class Swap_two_number_without_thrid_variable {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		System.out.println("Before swapping:" + a + ":" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping:" + a + ":" + b);

	}

}
