package com.studentmgmt;

import java.util.Scanner;

class Student {
    int id;
    String name;
    int marks;
    String grade;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - Marks: " + marks + " - Grade: " + grade;
    }
}

public class StudentGradeSystem {

    // Method to calculate grade
    public static String calculateGrade(int marks) {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "Fail";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Student[] students = new Student[n];

        // Input student details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Marks: ");
            int marks = sc.nextInt();

            students[i] = new Student(id, name, marks);
            students[i].grade = calculateGrade(marks);
        }

        // Display all students
        System.out.println("\n--- Student Details ---");
        for (Student s : students) {
            System.out.println(s);
        }

        // Find topper manually
        Student topper = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].marks > topper.marks) {
                topper = students[i];
            }
        }
        
        System.out.println("\nTopper: " + topper);

        sc.close();
    }
}
