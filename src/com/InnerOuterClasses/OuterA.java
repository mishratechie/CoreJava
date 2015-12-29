package com.InnerOuterClasses;
class OuterA
{
	int x;
	static int y;

	OuterA()
	{
		x = 10;
		y = 20;		// Static members can also be initialized inside a constructor

		System.out.println("Inside outer class constructor....");
	}

	void outerMethod()
	{
		System.out.println("Inside outer class method...."+y);			// Static members can be accessed from a non-static context

		Inner in = new Inner();
		in.innerMethod();
	}

	class Inner
	{
		int a;

		Inner()
		{
			a = 25;
		}

		//instance void innerMethod()											// Inner class CANNOT HAVE STATIC DECLARATIONS
		void innerMethod()
		{
			System.out.println("Inside inner class method...."+y);
		}
	};

	public static void main(String[] args) 
	{
		OuterA o = new OuterA();
		o.outerMethod();
	}
}