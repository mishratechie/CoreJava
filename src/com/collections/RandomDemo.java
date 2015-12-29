package com.collections;
import java.util.*;

class RandomDemo
{
	public static void main(String[] args) 
	{
		while(true)
		{
			Random ran = new Random();

			System.out.println( ( ran.nextInt() / 2000 >>> 1 ) / 1500);
			
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException a){}
		}
	}
}