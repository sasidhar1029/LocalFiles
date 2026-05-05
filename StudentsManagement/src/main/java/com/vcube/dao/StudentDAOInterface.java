package com.vcube.dao;

import com.vcube.model.LoginModel;
import com.vcube.model.Student;

public interface StudentDAOInterface {
	public String insertStudent(Student s);
	public String selectStudent(LoginModel lm);
}
