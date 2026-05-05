

public class PerfectRange {

    public static void main(String[] args) {
        int start = 1;
        int end = 1000; // You can change this range

        System.out.println("Perfect numbers between " + start + " and " + end + " are:");

        for (int num = start; num <= end; num++) {
            int sum = 0;

            // Find sum of proper divisors
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }

            // Check if sum equals the number
            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}
