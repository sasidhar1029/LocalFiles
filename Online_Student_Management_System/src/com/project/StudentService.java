package com.project;

import java.util.*;
import java.util.stream.Collectors;

public class StudentService {
	private ArrayList<Student> students = new ArrayList<>();

	// Add with duplicate ID validation (Day 4)
	public boolean addStudent(Student s) {
		for (Student st : students)
			if (st.getId() == s.getId())
				return false;
		students.add(s);
		return true;
	}

	// View All (Day 3)
	public void viewAll() {
		System.out.println("\nID\tName\tMarks\tDept");
		System.out.println("--------------------------------------");
		for (Student s : students)
			System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getMarks() + "\t" + s.getDept());
	}

	// Search by ID (Day 5)
	public Student searchById(int id) {
		for (Student s : students)
			if (s.getId() == id)
				return s;
		return null;
	}

	// Search by Name (Day 5)
	public List<Student> searchByName(String name) {
		return students.stream().filter(s -> s.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
	}

	// Update student (Day 6)
	public boolean updateStudent(int id, String name, int marks, String dept) {
		Student s = searchById(id);
		if (s == null)
			return false;
		s.setName(name);
		s.setMarks(marks);
		s.setDept(dept);
		return true;
	}

	// Delete student (Day 7)
	public boolean deleteStudent(int id) {
		return students.removeIf(s -> s.getId() == id);
	}

	// Sorting (Days 8–10)
	public void sortByMarks() {
		students.sort(Comparator.comparingDouble(Student::getMarks).reversed());
	}

	public void sortByName() {
		students.sort(Comparator.comparing(Student::getName));
	}

	public void sortByDeptAndMarks() {
		students.sort(Comparator.comparing(Student::getDept)
				.thenComparing(Comparator.comparingDouble(Student::getMarks).reversed()));
	}

	// Reports (Day 11–14)
	public Map<String, List<Student>> deptWiseStudents() {
		return students.stream().collect(Collectors.groupingBy(Student::getDept));
	}

	public Student highestMarksInDept(String dept) {
		return deptWiseStudents().get(dept).stream().max(Comparator.comparing(Student::getMarks)).orElse(null);
	}

	public Student lowestMarksInDept(String dept) {
		return deptWiseStudents().get(dept).stream().min(Comparator.comparing(Student::getMarks)).orElse(null);
	}

	public List<Student> top3Students() {
		return students.stream().sorted(Comparator.comparing(Student::getMarks).reversed()).limit(3)
				.collect(Collectors.toList());
	}

	public ArrayList<Student> getStudents() {
		return students;
	}
}
