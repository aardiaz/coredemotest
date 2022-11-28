package com.coredemo.view;

import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.Scanner;

import com.coredemo.model.Student;
import com.coredemo.service.StudentService;
import com.coredemo.service.StudentServiceImpl;

public class Test {

	public static void main(String[] args) {
		
		
		
		//int i, j, row = 6;       
		//Outer loop work for rows  
		for (int i=0; i<6; i++)   
		{  
		//inner loop work for space      
		for (int j=6-i; j>=0; j--)         
		{  
		//prints space between two stars      
		 System.out.print(" ");   
		}   
		//inner loop for columns  
		for (int j=0; j<=i; j++ )   
		{   
		//prints star      
		System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}   
		

//		StudentService ss = new StudentServiceImpl();
//		Scanner sc = new Scanner(System.in);
//		String flag = "y";
//
//		do {
//			Student s = new Student();
//
//			System.out.println("Enter id");
//			s.setId(sc.nextInt());
//
//			System.out.println("Enter fname");
//			s.setFname(sc.next());
//
//			s.setLname("Karki");
//			s.setCity("Ktm");
//			s.setCollege("NCC");
//			s.setRollno(409);
//
//			ss.addStudent(s);
//			System.out.println("Do you want to add more students [y/n]");
//			flag = sc.next();
//
//		} while (flag.equalsIgnoreCase("y"));
//
//		// ============== get All student =======================
//		List<Student> slist = ss.getAllStudent();
//
//		for (Student s : slist) {
//
//			System.out.println("Id = " + s.getId());
//			System.out.println("Name = " + s.getFname());
//			System.out.println("=============");
//		}
//
//		// ============== delete student ================
//
//		System.out.println("enter index ");
//		ss.deleteStudent(sc.nextInt());
//
//		// display data after deleted
//		List<Student> slist1 = ss.getAllStudent();
//
//		for (Student s : slist1) {
//
//			System.out.println("Id = " + s.getId());
//			System.out.println("Name = " + s.getFname());
//			System.out.println("=============");
//		}

		
//		LocalDate localDate  = LocalDate.now();
//		System.out.println(LocalDate.now(Clock.systemDefaultZone()));
//		System.out.println(LocalDate.now(ZoneId.systemDefault()));
//		System.out.println(LocalDate.now(Clock.systemDefaultZone()));
		
		
	}

}
