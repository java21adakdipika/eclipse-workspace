package com.aurionpro.test;

import java.time.LocalDate;

import com.aurionpro.model.Person;
import com.aurionpro.model.Professor;
import com.aurionpro.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student(101, "Kharghar, Sec-3", LocalDate.of(2023, 12, 02), "Computer");
		System.out.println(student1.toString());
		
		Professor professor1 = new Professor(102, "Kharghar, Sec-3", LocalDate.of(2023, 12, 02), 7000);
		System.out.println(professor1.toString());
		

	}

}
