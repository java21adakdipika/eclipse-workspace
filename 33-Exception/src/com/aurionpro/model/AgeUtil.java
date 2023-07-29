package com.aurionpro.model;

import com.aurionpro.exception.InvalidAgeException;

public class AgeUtil {
	
	public static void validateAge(int age) {
		if (age>=18) {
			System.out.println("User is eligible for voting");
		} else {
			throw new InvalidAgeException("Invalid age");
		}
	}
}
