package com.collections;
import java.util.*;

class GregorianCalenderDemo 
{
	public static void main(String[] args) 
	{
		String months[ ]=	{"Jan", "Feb", "Mar", "Apr",
							 "May", "Jun", "Jul", "Aug",
							 "Sep", "Oct", "Nov", "Dec"};

		int year;	

		// Create a calendar initialized with the
		// current date and time in the default
		// locale and timezone
		GregorianCalendar gc = new GregorianCalendar();

		// Display current time and date information
		System.out.print("Date : ");
		System.out.print(months[gc.get(Calendar.MONTH)]);
		System.out.print(" " + gc.get(Calendar.DATE) + " ");
		System.out.println(year = gc.get(Calendar.YEAR));

		System.out.print("Time : ");
		System.out.print(gc.get(Calendar.HOUR) + " : " );
		System.out.print(gc.get(Calendar.MINUTE) + " : " );
		System.out.println(gc.get(Calendar.SECOND));

		// Test if the current year is a leap year
		if(gc.isLeapYear(year))
		{
			System.out.println("The current year is a leap year.");
		}
		else
		  {
				System.out.println("The current year is not a leap year.");
		  }
	}
}