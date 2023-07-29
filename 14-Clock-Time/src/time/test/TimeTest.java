package time.test;

import time.model.TimeModel;

public class TimeTest {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner()
		
		TimeModel time1 = new TimeModel(16, 32, 47);
		
		TimeModel time2 = new TimeModel(14, 40, 100);
		
		
		String time = addTime(time1, time2);
		System.out.println(time);

	}
	
	public static String addTime(TimeModel time1, TimeModel time2) {
		
		String time3;
		
		int addsecs = time1.getSeconds() + time2.getSeconds(); // 47 + 49 = 96
		
		int addmin = time1.getMinutes() + time2.getMinutes(); // 32 + 40 = 72
		int addhrs =  time1.getHours() + time2.getHours(); // 16 + 14 = 30
		
		
		while (addsecs > 60) {
			if ( addsecs > 60) {
				addsecs = addsecs - 60; // 129 - 60 = 69 // 69 - 60 = 9
				addmin = addmin + 1; // 72 + 1 = 73 + 1 = 74
			}
		}
		
		while (addmin > 60) {
			if (addmin>60) {
				addmin = addmin -60; // 74 - 60 = 14
				addhrs = addhrs + 1; // 31
			}
		}
		
		if (addhrs>24) {
			addhrs = addhrs - 24; // 31 - 24 = 7
		}
		
		
		time3 = addhrs + " : " + addmin + " : " + addsecs;
		return time3;
		
		
	}

}
