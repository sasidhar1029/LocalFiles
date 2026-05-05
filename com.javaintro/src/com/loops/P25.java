package com.loops;

import java.util.Scanner;

public class P25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();

        if (a >= 91 && a <= 100) {
            System.out.println("super smart");
        } else if (a >= 81 && a <= 90) {
            System.out.println("smart");
        } else if (a >= 71 && a <= 80) {
            System.out.println("smart enough");
        } else if (a >= 61 && a <= 70) {
            System.out.println("just smart");
        } else if (a >= 36 && a <= 60) {
            System.out.println("no smart");
        } else if (a >= 1 && a <= 35) {
            System.out.println("print dumb");
        } else {
            System.out.println("invalid range");
        }


    }
}
