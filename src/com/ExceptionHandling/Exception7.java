package com.ExceptionHandling;

// User Defined Exception

class OutofRange extends Exception
{
	OutofRange(String ss)
	{
		super(ss);
	}	
}

public class Exception7
{
		public static void main(String args[])
		{
				int i=10;
				try
				{
					if(i<12) 
					  throw new OutofRange("10 is the limit");
				}
				catch(OutofRange o)
				{
					System.out.println("Error : " + o.getMessage());
				}

				System.out.println("After try/catch blocks.");
		} 	
}
