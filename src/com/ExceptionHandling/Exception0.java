package com.ExceptionHandling;

//Uncaught Exception

class Exception0
{
		public static void main(String args[])
		{
				int d = 0;
				int a = 42 / d;

				System.out.println("After exception raised...");
		} 	
}

// When the JRE detects the attempt to 
//divide by zero, it constructs a new 
//exception object and then throws this
//exception.
