package time.test;

import time.model.TimeModel;

public class TimeTest {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner()
		
		TimeModel time = new TimeModel(16, 32, 47);
		TimeModel time1 = new TimeModel(73, 72, 105);
//		TimeModel time1 = new TimeModel(10, 16, 40);
//		System.out.println(time);
		
		addTime(time, time1);

	}
	
	public static void addTime(TimeModel time, TimeModel time1) {
		int addsecs = time1.getSeconds() + time.getSeconds();
		int addmin = time1.getMinutes() + time.getMinutes();
		int addhrs =  time1.getHours() + time.getHours();
		
		while (addsecs > 60) {
			if ( addsecs > 60) {
				addsecs = addsecs - 60;
				addmin = addmin + 1;
			}
		}
		
		while (addsecs > 60) {
			if (addmin>60) {
				addmin = addmin -60;
				addhrs = addhrs + 1;
			}
		}
		
		if (addhrs>24) {
			addhrs = addhrs % 24;
		}
		
		System.out.println(addhrs + " : " + addmin + " : " + addsecs);
		
		
	}

}
