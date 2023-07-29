package com.aurionpro.test;
import java.util.Scanner;

import com.aurionpro.exception.InvalidAgeException;
import com.aurionpro.model.AgeUtil;

public class ValidateAgeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user's age: ");
		int age = sc.nextInt();
		
		try {
			AgeUtil.validateAge(age);
		} catch (InvalidAgeException e) {
			System.out.println(e);
		}

	}

}
