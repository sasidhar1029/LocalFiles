package Synatax_and_variables;

public class Recursion {
	static int count = 0;

	static void printHello(int n) {
		// if condition is compulsary coz it stopping when it is zero
		// orelse it will be stackOverFlow
		if (n == 0) {
			return;
		}
		System.out.println("Hello");
		printHello(n - 1);
		// this method call is used decrease the -1 by each time it will one time 0
		// then program will stop there
		count++;
	}

	public static void main(String[] args) {
		printHello(40);
		System.out.println(count);
	}

}
