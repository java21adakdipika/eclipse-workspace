package feet.test;

import time.model.TimeModel;

public class FeetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static void correctFeet(Feet tempFeet) {
		if(tempTime.getHour()>23) {
			tempTime.setHour(tempTime.getHour()%24);
		}
	}

	private static void correctInches(Feet tempFeet) {
		while(tempTime.getMinute()>60) {
			tempTime.setMinute(tempTime.getMinute()-60);
			tempTime.setHour(tempTime.getHour()+1);
		}
	}
}
