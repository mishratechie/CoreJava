package com.ExceptionHandling;

// Exception Propagation

public class Exception9
{
		public static void main(String args[])
		{
				System.out.println("inside main(). calling method1()");
			
				method1();

				System.out.println("End of the program.");
		}

		public static void method1()
		{
				System.out.println("inside method1(). calling method2()");
			
				method2();

				System.out.println("Returning from method1().");
		}	
		
		public static void method2()
		{
				System.out.println("inside method2(). calling method3()");
			
				method3();

				System.out.println("Returning from method2().");
		}	

		public static void method3()
		{
				System.out.println("inside method3(). executing method3()");
			
				int i=1, j=0, k;

				k=i/j;

				System.out.println("Returning from method3().");
		}	
}
