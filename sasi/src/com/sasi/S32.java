package com.sasi;

import java.util.Scanner;

public class S32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a dress size");
         int dressSize = sc.nextInt();
          switch(dressSize) {
          case 32 -> System.out.println("S");
          case 38 -> System.out.println("M");
          case 40-> System.out.println("L");
          case 42 -> System.out.println("Xl");
          default -> System.out.println("invalid size");
        }

        
    }
}
