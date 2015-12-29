package com.InnerOuterClasses;
class  OuterK
{
	int x;
	static int y;

	OuterK()
	{
		x = 10;
		y = 20;											// Static members can also be initialized inside a constructor

		System.out.println("Inside outer class constructor....");

		Inner in = new Inner();
		in.innerMethod();
	}

	// Inner class CAN BE declared FINAL ONLY outside a constructor / method....
	final class Inner
	{
		int a;

		Inner()
		{
			a = 25;
		}

		void innerMethod()
		{
			System.out.println("Inside final inner class method...."+y);			// static members can be referenced from non-static members
		}
	};

	public static void main(String[] args) 
	{
		new OuterK();
	}
}