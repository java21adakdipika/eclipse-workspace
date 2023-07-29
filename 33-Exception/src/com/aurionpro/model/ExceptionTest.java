package com.aurionpro.model;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int firstNumber = Integer.parseInt(args[0]);
			int secondNumber = Integer.parseInt(args[1]);
			int div = firstNumber/secondNumber;
			System.out.println(div);
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Access to invalid index position");
		}
		catch (ArithmeticException e) {
			System.out.println("Number cannot be divided by zero");
		}
		catch (NumberFormatException e) {
			System.out.println("Invalid data type.");
		}
		finally {
			System.out.println("Finally");
		}
		
		System.out.println("Line executed out of try - catch block");
		
	}

}
