package com.ExceptionHandling;

/* Nested try statements

   Try statement can be inside the block of another try. 
   Each time a try statement is entered, the 
   context of that exception is pushed on the stack. 
   If an inner try statement does not have a catch
   handler for a particular exception, the stack
   is unwound and the next try statement's
   catch handlers  are inspected for a match. 
   This continues until one of the catch 
   statements succeeds, or until all of the
   nested try statements are exhausted. If no 
   catch statement matches, then nested the 
   Java run-time system will handle the 
   exception.  
*/

class Exception5
{
		public static void main(String args[])
		{
				try
				{
						int a = args.length;

						int b = 42 / a;

						System.out.println("a = " + a);
					  
						try
						{
								if(a==1)
								   a= a/(a-a);

								if(a==2)
								{
								   int c[] = {1};
								   c[5] = 99;	
								}
						}	
						catch(ArrayIndexOutOfBoundsException e)
						{
							System.out.println("Array Index oob Exception....");
						}
				}
				catch(ArithmeticException e1)
				{
					System.out.println("Divide by 0 : " + e1);
				}

				System.out.println("After try/catch blocks.");
		} 	
}