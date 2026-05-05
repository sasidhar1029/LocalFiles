package com.loops;
// print prime numbers 1 to 100;
public class P29 {

    public static void main(String[] args) {
        for (int i = 1; i <=100; i++) { // Print primes up to 100
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= n / 2; i++) {
        if (n % i == 0) {
        return false;
            }
        }
        return true;
    }
}
