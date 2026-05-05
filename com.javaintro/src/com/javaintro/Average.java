package com.javaintro;

 public class Average {
    void method(int m, int p, int c, int id, String name, int age) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        
        int avg = (m + p + c) / 3;
        System.out.println("Average Marks: " + avg);

        if (avg > 35) {
            System.out.println("Student is pass");
        } else {
            System.out.println("Student is fail");
        }
    }

    public static void main(String[] args) {
        Average p1 = new Average();
        p1.method(20, 37, 67, 1, "sasi", 22);
        // Uncomment to test another student
        // p1.method(22, 42, 64, 2, "sai", 23);
    }
}
