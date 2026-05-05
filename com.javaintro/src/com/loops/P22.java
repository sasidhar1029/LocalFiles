package com.loops;
public class P22 {
    public static void main(String[] args) {
        int n = 5;  
        int count = 0;
        int num;

        for (num = 2; ; num++) {  
            int isPrime = 1;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = 0;
                    break;
                }
            }

            if (isPrime == 1) {
                count++;
            }

            if (count == n) {
                break;
            }
        }

        System.out.println("The " + n + "th prime number is: " + num);
    }
}
