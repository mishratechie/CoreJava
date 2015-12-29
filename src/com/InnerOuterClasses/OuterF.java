package com.InnerOuterClasses;
class OuterF
{
	int x;
	static int y;

	OuterF()
	{
		x = 10;
		y = 20;		// Static members can also be initialized inside a constructor

		System.out.println("Inside outer class constructor....");
		
		// Objects for the Inner static class can be created
		Inner in = new Inner();					
		in.innerMethod();
		//Inner.innerMethod();
	}

	// Inner class CAN BE declared STATIC ONLY outside a constructor / method....
	// Inner class CANNOT HAVE STATIC DECLARATIONS
	static class Inner
	{
		int a;

		Inner()
		{
			a = 25;
		}

		static void innerMethod()			
		{
			System.out.println("Inside inner class method...."+y);			// static members can be referenced from non-static members
		}
	}

	public static void main(String[] args) 
	{
		new OuterF();
	}
}