package com.coredemo.service;


import java.util.List;

import com.coredemo.model.Student;

public interface StudentService {

	void addStudent(Student std) ;

	void deleteStudent(int index);

	List<Student> getAllStudent();
}
