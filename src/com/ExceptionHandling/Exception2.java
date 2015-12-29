package com.ExceptionHandling;

// Providing Exception Handling mechanism 

class Exception2
{
		public static void main(String args[])
		{
				int d, a;

				try
				{
					d = 0;

					a = 42 / d;

					System.out.println("This will not be printed");
				}
				catch(ArithmeticException e)
				{
					System.out.println("Division by zero.");
				}

				System.out.println("After catch statement.");
		} 	
}

/*
Once an exception is thrown, program control
tranfers out of the try block,
into the catch block. Put differently, catch is
not "called", so execution 
never "returns" to the try block from a catch.
Thus, the line " This will not
be printed", is not displayed.
*/
