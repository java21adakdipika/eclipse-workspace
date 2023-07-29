package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
		System.out.println(numbers);
		System.out.println(numbers.size());
		
		System.out.println(numbers.contains(30));
		
		numbers.remove(new Integer(10));
		System.out.println(numbers); 
		
		numbers.remove(0);   // removes 20
		System.out.println(numbers);
		
		numbers.clear();
		System.out.println(numbers);

	}

}
