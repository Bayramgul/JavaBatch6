package com.syntax.class06;

public class Recap {

	public static void main(String[] args) {
/*if hours btw 1-11--->morning
 * if hours btw 12-15--->afternoon
 * if hours btw 16-20--->evening
 * if hours btw 21-24--->night
 */
		int hour=89;
		//will gain value based on the condition;
		String timeOfDay;
		if(hour>=1 && hour<=11) {
			timeOfDay="Morning";
		}else if (hour >=12 && hour <=15) {
			timeOfDay="Afternoon";
		}else if (hour >=16 && hour <=20) {
			timeOfDay="Evening";
		}else if (hour>=21 && hour <=24) {
			timeOfDay="Night";
		}else {
			timeOfDay="Unknown";
		}//if time of the day is not unknown -->only then I want to see the message
		
		if (!timeOfDay.equals("Unknown")) {
			
			System.out.println("Right now is "+ timeOfDay);
			
		}
	}

}
