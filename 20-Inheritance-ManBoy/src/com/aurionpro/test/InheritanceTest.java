package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.Infant;
import com.aurionpro.model.Kid;
import com.aurionpro.model.Man;

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		case1();
		System.out.println("****************************");
		case2();
		System.out.println("****************************");
		case3();
		System.out.println("****************************");
		case4();
		System.out.println("****************************");
		case5();
		System.out.println("****************************");
		case6();
		System.out.println("****************************");
	}
	
	private static void case1() {
		Man man;
		man = new Man();
		man.read();
		man.play();
	}

	private static void case2() {
		Boy boy;
		boy = new Boy();
		boy.eat();
		boy.read();
	}

	
	private static void case3() {
		Man man;
		man = new Infant();
		man.read();
		man.play();
	}
	
	private static void case4() {
		PlayAtPark(new Man());
		PlayAtPark(new Boy());
		PlayAtPark(new Kid());
		PlayAtPark(new Infant());
		
	}
	
	private static void PlayAtPark(Man man) {
		System.out.println("At the park");
		man.play();
	}
	
	private static void case5() {
		Object obj;
		obj = 10;
		System.out.println(obj.getClass().getSimpleName());
		
		obj = "Java Programming";
		System.out.println(obj.getClass().getSimpleName());
		
		obj = 10<20;
		System.out.println(obj.getClass().getSimpleName());
	}
	
	private static void case6() {
		typeCastObject(new Infant());
	}

	private static void typeCastObject(Man man) {
		if(man instanceof Infant) {
			Infant infant=(Infant)man;
			infant.sleep();
		}
		
	}

}
