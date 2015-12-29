package com.ExceptionHandling;

//Uncaught Exception

class Exception1
{
	static void method()
	{
		int d = 0;
		int a = 42 / d;
	}
	
	public static void main(String args[])
	{
		method();
	} 	
}

/*
 The stack trace will always show the
 sequence of method invocations that
 led up to the error. 
*/