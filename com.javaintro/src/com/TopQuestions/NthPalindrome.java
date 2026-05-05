package com.TopQuestions;

import java.util.Scanner;

public class NthPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n (which palindrome you want): ");
        int n = sc.nextInt();

        int count = 0;
        int num = 1;

        while (true) {
            int a = num;
            int temp = a;
            int sum = 0;

            while (a != 0) {
                int d = a % 10;
                sum = sum * 10 + d;
                a = a / 10;
            }

            if (temp == sum) {   // same checking logic
                count++;
                if (count == n) {
                    System.out.println("The " + n + "th palindrome number is: " + temp);
                    break;
                }
            }

            num++;
        }
    }
}
