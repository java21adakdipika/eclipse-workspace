package com.aurionpro.test;

import com.aurionpro.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		
		student.id=10;
		student.name="Dinesh";
		student.email="dipikaadak23@gmail.com"; // not needed getter
		student.percentage=86;
		
		System.out.println("Id is " + student.id + " and name is " + student.name);

	}

}
