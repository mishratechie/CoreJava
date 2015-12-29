package com.ExceptionHandling;

public class Exception8
{
	public static void main(String args[])
	{
		int i=1, j=0, k;

		try
		{
			 k=i/j;
		}
		catch(RuntimeException re)
		{
			if(re instanceof ArithmeticException)
			{
			   System.out.println("Division by zero is illegal");
			}
		}

		System.out.println("Hello World");
	} 	
}
