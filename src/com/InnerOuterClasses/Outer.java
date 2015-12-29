package com.InnerOuterClasses;

class Outer
{
	int x;
	static int y;

	Outer()
	{
		x = 10;
		y = 20;										// Static members can also be initialized inside a constructor

		System.out.println("Inside outer class constructor....");

		Inner in = new Inner();
		in.innerMethod();
	}

	class Inner
	{
		int a;

		Inner()
		{
			a = 25;
			System.out.println("Inside inner class constructor....");
		}

		void innerMethod()
		{
			System.out.println("Inside inner class method...."+y);
		}
	}

	public static void main(String[] args) 
	{
		new Outer();
	}
}
