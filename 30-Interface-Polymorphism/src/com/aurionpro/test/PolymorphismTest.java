package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.IEmotionable;
import com.aurionpro.model.IMannerable;
import com.aurionpro.model.Man;

public class PolymorphismTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man man = new Man();
		Boy boy = new Boy();
		
		atTheParty(man);
		atTheParty(boy);
		
		//atTheMovies(man);
		atTheMovies(boy);

	}
	
	public static void atTheParty(IMannerable person) {
		// TODO Auto-generated method stub
		System.out.println("At the Party Hall");
		person.wish();
		person.deport();

	}
	
	public static void atTheMovies(IEmotionable person) {
		// TODO Auto-generated method stub
		System.out.println("At the Movie Theatre");
		person.cry();
		person.laugh();

	}

}
