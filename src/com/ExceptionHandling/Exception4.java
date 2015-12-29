package com.ExceptionHandling;
/* This program contains an error.

   A subclass must come before its superclass
   in a series of catch statements.
   If not, unreachable code will be created and
   a compile-time error will result.
*/

class Exception4
{
		public static void main(String args[])
		{
				try
				{
					int a = args.length;

					System.out.println("a = " + a);

					int b = 42 / a;

					System.out.println("This will not be printed");
				}
				catch(Exception e)
				{
					System.out.println("Generic Exception Catch : " + e);
				}
				//catch(ArithmeticException e1) //Uncomment and learn error
				{
					System.out.println("This is never reached");
				}

				System.out.println("After try/catch blocks.");
		} 	
}

/*
 If you try to compile this program, you will
 receive an error message stating that the second
 catch statement is unreachable. Since, 
 "ArithmeticException" is a subclass of Exception,
 the first catch statement will handle all 
 Exception-based errors, including ArithmeticException.
*/