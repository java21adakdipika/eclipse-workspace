package com.aurionpro.test;

import com.aurionpro.model.ClassifyPlayer;
import com.aurionpro.model.Player;

public class ClassifyPlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player[] players = {
				new Player(1, "Dipika", 200, 4000, 85),
				new Player(2, "Lipika", 70, 7000, 160),
				new Player(3, "Fipika", 40, 3500, 170),
				new Player(4, "Mipika", 150, 4000, 140),
				new Player(5, "Dipika", 180, 6000, 155),
				new Player(6, "Dipika", 80, 1000, 96),
				new Player(7, "Lipika", 90, 6670, 112),
				new Player(8, "Fipika", 40, 4196, 89),
				new Player(9, "Mipika", 150, 7000, 140),
				new Player(10, "Dipika", 87, 3186, 91)
		};
		
		ClassifyPlayer classify = new ClassifyPlayer();
		
		Player[] alister = classify.getAListeners(players);
		Player[] blister = classify.getBListeners(players);
		Player[] clister = classify.getCListeners(players);
		
		System.out.println("A-Listers are :");
		for(int i=0; i<alister.length; i++) {
			System.out.println(alister[i].toString());
		}
		
		System.out.println("***************************************");
		
		System.out.println("B-Listers are :");
		for(int i=0; i<blister.length; i++) {
			System.out.println(blister[i].toString());
		}
		
		System.out.println("***************************************");
		
		System.out.println("C-Listers are :");
		for(int i=0; i<clister.length; i++) {
			System.out.println(clister[i].toString());
		}

	}

}
