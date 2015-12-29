package com.ExceptionHandling;

// Providing Multiple Exception Handling mechanism 

class Exception3
{
		public static void main(String args[])
		{
				try
				{
					int a = args.length;

					System.out.println("a = " + a);

					int b = 42 / a;

					int c[] = { 1 };

					c[5] = 99;	

					System.out.println("This will not be printed");
				}
				catch(ArithmeticException e1)
				{
					System.out.println("Division by zero : " + e1);
				}
				catch(ArrayIndexOutOfBoundsException e2)
				{
					System.out.println("Array index oob : " + e2);
				}

				System.out.println("After try/catch blocks.");
		} 	
}

/*
 When you use multiple catch statements, remember that Exception subclasses
 mustcome before any of their superclass.This is because a catch statement
 that uses a superclass will catch exceptions of that type plus any of its
 subclasses. Thus, a subclass would never be reached if it came after its 
 superclass. Further, in Java, unreachable code is an error.
*/