package com.loops;
import java.util.Scanner;

public class PerfectorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int sum = 0;

        for(int i = 1; i < num; i++) {  // Start from 1, go till num-1
            if(num % i == 0) {
                sum += i;
            }
        }

        if(sum == num) {
            System.out.println("The given number is a Perfect Number: " + num);
        } else {
            System.out.println("The given number is NOT a Perfect Number.");
        }
    }
}
