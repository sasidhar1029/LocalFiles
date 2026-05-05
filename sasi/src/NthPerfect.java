
		import java.util.Scanner;

		public class NthPerfect {

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter which Perfect Number (n-th) you want: ");
		        int n = sc.nextInt();

		        int count = 0;
		        int num = 1;

		        while (true) {
		            int sum = 0;

		            // Calculate sum of proper divisors
		            for (int i = 1; i <= num / 2; i++) {
		                if (num % i == 0) {
		                    sum += i;
		                }
		            }

		            // Check for perfect number
		            if (sum == num) {
		                count++;
		                if (count == n) {
		                    System.out.println("The " + n + "-th perfect number is: " + num);
		                    break;
		                }
		            }
		            num++;
		        }
		    }
		


	}


