package com.InnerOuterClasses;
class OuterB
{
	int x;
	static int y;

	OuterB()
	{
		x = 10;
		y = 20;		// Static members can also be initialized inside a constructor

		System.out.println("Inside outer class constructor....");
	}

	void outerMethod()
	{
		System.out.println("Inside outer class method...."+y);			// Static members can be accessed from a non-static context

		// Inner class inside a method....
		class Inner
		{
			int a;

			Inner()
			{
				a = 25;
			}

			void innerMethod()
			{
				System.out.println("Inside inner class method...."+x);
			}
		}

		Inner in = new Inner();
		in.innerMethod();
	}

	public static void main(String[] args) 
	{
		OuterB o = new OuterB();
		o.outerMethod();
	}
}