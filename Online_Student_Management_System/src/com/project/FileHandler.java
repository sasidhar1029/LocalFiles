package com.project;

import java.io.*;
import java.util.ArrayList;

public class FileHandler {
    private static final String FILE = "students.txt";

    // Save to file
    public static void save(ArrayList<Student> list) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE))) {
            for (Student s : list)
                pw.println(s);
            System.out.println("✔ Data saved to file!");
        } catch (Exception e) {
            System.out.println("❌ Error saving file");
        }
    }

    // Load from file
    public static void load(ArrayList<Student> list) {
        list.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] a = line.split(",");
                list.add(new Student(Integer.parseInt(a[0]), a[1], Integer.parseInt(a[2]), a[3]));
            }
            System.out.println("✔ Data loaded from file!");
        } catch (Exception e) {
            System.out.println("❌ No previous data found.");
        }
    }
}
