package com.collections;
import java.util.*;

class CalenderDemo 
{
	public static void main(String[] args) 
	{
		String months[]=	{"Jan", "Feb", "Mar", "Apr",
							 "May", "Jun", "Jul", "Aug",
							 "Sep", "Oct", "Nov", "Dec"};

		// Create a calendar initialized with the
		// current date and time in the default
		// locale and timezone
		Calendar c = Calendar.getInstance();

		// Display current time and date information
		System.out.print("Date : ");
		System.out.print(months[c.get(Calendar.MONTH)]);
		System.out.print(" " + c.get(Calendar.DATE) + " ");
		System.out.println(c.get(Calendar.YEAR));

		System.out.print("Time : ");
		System.out.print(c.get(Calendar.HOUR) + " : " );
		System.out.print(c.get(Calendar.MINUTE) + " : " );
		System.out.println(c.get(Calendar.SECOND));

		// Set the time and date information and display it
		c.set(Calendar.HOUR, 10);
		c.set(Calendar.MINUTE, 29);
		c.set(Calendar.SECOND, 22);

		System.out.print("Updated Time : ");
		System.out.print(c.get(Calendar.HOUR) + " : " );
		System.out.print(c.get(Calendar.MINUTE) + " : " );
		System.out.println(c.get(Calendar.SECOND));
	}
}