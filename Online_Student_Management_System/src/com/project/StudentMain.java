package com.project;

import java.util.*;

public class StudentMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        // Load data from file on start
        FileHandler.load(service.getStudents());

        while (true) {
            System.out.println("\n========= STUDENT MANAGEMENT =========");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search by ID");
            System.out.println("4. Search by Name");
            System.out.println("5. Update Student");
            System.out.println("6. Delete Student");
            System.out.println("7. Sort by Marks");
            System.out.println("8. Sort by Name");
            System.out.println("9. Sort by Dept + Marks");
            System.out.println("10. Dept-wise Report");
            System.out.println("11. Top 3 Students");
            System.out.println("12. Save to File");
            System.out.println("13. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            try {
                switch (ch) {
                    case 1:
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt(); sc.nextLine();
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Marks: ");
                        int marks = sc.nextInt(); sc.nextLine();
                        System.out.print("Enter Dept: ");
                        String dept = sc.nextLine();

                        if (service.addStudent(new Student(id, name, marks, dept)))
                            System.out.println("✔ Student Added");
                        else
                            System.out.println("❌ ID already exists!");
                        break;

                    case 2:
                        service.viewAll();
                        break;

                    case 3:
                        System.out.print("Enter ID: ");
                        int sid = sc.nextInt();
                        Student s = service.searchById(sid);
                        System.out.println(s == null ? "❌ Not Found" : s);
                        break;

                    case 4:
                        System.out.print("Enter Name: ");
                        String nm = sc.nextLine();
                        List<Student> list = service.searchByName(nm);
                        System.out.println(list.isEmpty() ? "❌ Not Found" : list);
                        break;

                    case 5:
                        System.out.print("Enter ID to Update: ");
                        int uid = sc.nextInt(); sc.nextLine();
                        System.out.print("New Name: ");
                        String un = sc.nextLine();
                        System.out.print("New Marks: ");
                        int um = sc.nextInt(); sc.nextLine();
                        System.out.print("New Dept: ");
                        String ud = sc.nextLine();

                        System.out.println(service.updateStudent(uid, un, um, ud) ? "✔ Updated" : "❌ ID Not Found");
                        break;

                    case 6:
                        System.out.print("Enter ID to Delete: ");
                        int did = sc.nextInt();
                        System.out.println(service.deleteStudent(did) ? "✔ Deleted" : "❌ ID Not Found");
                        break;

                    case 7: service.sortByMarks(); System.out.println("✔ Sorted by Marks"); break;
                    case 8: service.sortByName(); System.out.println("✔ Sorted by Name"); break;
                    case 9: service.sortByDeptAndMarks(); System.out.println("✔ Sorted by Dept + Marks"); break;

                    case 10:
                        Map<String, List<Student>> map = service.deptWiseStudents();
                        map.forEach((department, stuList) -> {
                            System.out.println("\n➡ Dept: " + department);
                            stuList.forEach(System.out::println);
                        });
                        break;

                    case 11:
                        System.out.println("\n🎯 Top 3 Students:");
                        service.top3Students().forEach(System.out::println);
                        break;

                    case 12:
                        FileHandler.save(service.getStudents());
                        break;

                    case 13:
                        System.out.println("✔ Saving & Exiting...");
                        FileHandler.save(service.getStudents());
                        System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("❌ Invalid Input!");
            }
        }
    }
}
