package com.coredemo.service;

import java.util.ArrayList;
import java.util.List;

import com.coredemo.model.Student;

public class StudentServiceImpl implements StudentService {
	
	List<Student>  slist = new ArrayList<>();

	@Override
	public void addStudent(Student std) {
		 
		slist.add(std);
		System.out.println("size = "+slist.size());
	}

	@Override
	public void deleteStudent(int index) {
		 
		slist.remove(index);
		System.out.println(" size after delete = "+slist.size());
	}

	@Override
	public List<Student> getAllStudent() {
		
		return slist;
	}

	
}
