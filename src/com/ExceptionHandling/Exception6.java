package com.ExceptionHandling;

// Throw an exception explicitly, using the throw statement

class Exception6
{
		static void demoproc()
		{
				try
				{
					throw new NullPointerException("demo");
				}
				catch(NullPointerException e)
				{
					System.out.println("Caught inside demoproc");
					throw e;	// rethrow the exception
				}
		}		
		
		public static void main(String args[])
		{
				try
				{
					demoproc();
				}
				catch(NullPointerException e)
				{
					System.out.println("Recaught : " + e);
				}

				System.out.println("After try/catch blocks.");
		} 	
}
