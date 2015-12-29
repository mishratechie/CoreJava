package com.collections;
import java.util.*;

class  DateDemo1
{
	public static void main(String[] args) 
	{
		String s, time = "";

		Date dt = new Date();
		
		s = dt.toString();

		System.out.println("Time : " + s);

		System.out.println("length : " + s.length());

		time = s.substring(1, (s.length()-5)); 
		
		System.out.println("Time : " + time);

		time = time.substring(0, 8);

		System.out.println("Time : " + time);
	}
}