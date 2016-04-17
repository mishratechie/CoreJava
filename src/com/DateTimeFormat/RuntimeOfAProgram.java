package com.DateTimeFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RuntimeOfAProgram {
	
	
	
	public static void main(String[] args) throws ParseException, InterruptedException {
		
		String startTime=getCurrentTime();
		
		Thread.sleep(5000);
		
		String endTime=getCurrentTime();
		
		
		String totalTimeTaken=getUtilityRunTime(startTime, endTime);
		System.out.println("totalTimeTaken "+totalTimeTaken);
		
		
		
	}
	


	public static String getCurrentTime(){
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	  	Date date = new Date();
	  	String sysTime=dateFormat.format(date);
	  	System.out.println(sysTime);
		return sysTime;
	}

	public static String getUtilityRunTime(String startTime,String endTime) throws ParseException{
	
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		Date date1 = format.parse(startTime);
		Date date2 = format.parse(endTime);
		long difference = date2.getTime() - date1.getTime();
		long Seconds = difference / 1000 % 60;
		long Minutes = difference / (60 * 1000) % 60;
		//long Hours = difference / (60 * 60 * 1000) % 24;
		//long Days = difference / (24 * 60 * 60 * 1000);
		
		String timeTaken=Minutes+" Minutes " + Seconds + " Seconds " ;
				
		return timeTaken;
	}


}
