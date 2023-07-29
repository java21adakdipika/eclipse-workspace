package com.aurionpro.model;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main start");
		function1();
		System.out.println("Main End");
	}
	
	private static void function1() {
		System.out.println("Function 1 start");
		try {
			function2();
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Handled... in function 1.");
		}
		
		System.out.println("Function 1 ends");
	}
	
	private static void function2() {
		System.out.println("Function 2 start");
		function3();
		System.out.println("Function 2 ends");
	}
	
	private static void function3() {
		System.out.println("Function 3 start");
		function4();
		System.out.println("Function 3 ends");
	}
	
	private static void function4() {
		System.out.println("Function 4 start");
		throw new RuntimeException();
	}

}
