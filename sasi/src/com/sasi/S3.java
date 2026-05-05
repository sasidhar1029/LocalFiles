package com.sasi;

public class S3 {

    static double sem1(double a) {
        double sem1 = 9.1;
        System.out.println("Semester 1 GPA: " + sem1);
        return sem1;  
    }
    static double sem2(double a) {
        double sem2 = 8.3;
        System.out.println("Semester 2 GPA: " + sem2);
        return sem2;  
    }
    static double sem3(double a) {
        double sem3 = 7.2;
        System.out.println("Semester 3 GPA: " + sem3);
        return sem3;  
    }
    static double sem4(double a) {
        double sem4 = 7.2;
        System.out.println("Semester 4 GPA: " + sem4);
        return sem4; 
    }
    static double sem5(double a) {
        double sem5 = 8.2;
        System.out.println("Semester 5 GPA: " + sem5);
        return sem5; 
    }
    static double sem6(double a) {
        double sem6 = 7.9;
        System.out.println("Semester 6 GPA: " + sem6);
        return sem6;  
    }
    static double sem7(double a) {
        double sem7 = 7.5;
        System.out.println("Semester 7 GPA: " + sem7);
        return sem7; 
    }
    static double sem8(double a) {
        double sem8 = 6.9;
        System.out.println("Semester 8 GPA: " + sem8);
        return sem8;  
    }

    public static void main(String[] args) {
        double result = (sem1(9.1)+sem2(8.3)+sem3(7.2)+sem4(7.2)+sem5(8.2)+sem6(7.9)+sem7(7.5)+sem8(6.9))/8;  // Pass a value (any double) as required
        System.out.println("Total GPA: " + result);
    }
}
