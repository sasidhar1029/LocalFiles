package com.vcube.dao;

import java.util.List;

import com.vcube.dto.Login;
import com.vcube.dto.Student;
import com.vcube.dto.UpasswordDto;

public interface StudentDAOInterface {

    // Registration
    String register(Student s);

    // Login validation
    String login(Login l);

    // Forgot password
    String updateStudent(UpasswordDto u);

    // Update profile
    boolean updateProfile(Student s);

    // Admin - view all students
    List<Student> getAllStudents();

    // Profile fetch
    Student getStudentByUsername(String username);
}
