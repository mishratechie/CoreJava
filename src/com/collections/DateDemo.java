package com.collections;
import java.util.*;

class DateDemo
{
	public static void main(String[] args) 
	{
		// Instantiate a Data object
		Date dt = new Date();

		// Display time and date
		System.out.println(dt);

		// Display number of milliseconds since midnight, January 1, 1970 GMT
		long msec = dt.getTime();

		System.out.println("Milliseconds since midnight, Jan 1, 1970 GMT : " + msec);
	}
}