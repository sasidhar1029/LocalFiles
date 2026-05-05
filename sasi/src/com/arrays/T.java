package com.arrays;

public class T {

    public static void main(String[] args) {
        int[] arr = { 12, 103, 702, 560 };

        // Print original numbers
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Reversing each number using string concat logic
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            String reversed = "";

            // if number is 0
            if (n == 0) {
                reversed = "0";
            }

            // extract digits and build reversed string
            while (n != 0) {
                int digit = n % 10;
                reversed = reversed + digit; // string concat
                n = n / 10;
            }

            // to preserve leading zeros, check digit count
            int originalLength = String.valueOf(arr[i]).length();
            int reversedLength = reversed.length();

            // if reversed is shorter, pad with zeros at the start
            while (reversedLength < originalLength) {
                reversed = "0" + reversed;
                reversedLength++;
            }

            System.out.print(reversed + " ");
        }
    }
}

