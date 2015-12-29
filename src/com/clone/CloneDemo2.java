package com.clone;
/**
Overrides clone() so that it can be called from code outside of its class. To do this,
its access specifier must be public.
*/

class TestClone22 implements Cloneable
{
	int a;
	double b;

	// Object's clone() is now overridden and is public

	public Object clone()
	{
		try
		{
			// call clone in Object
			return super.clone();
		}
		catch(CloneNotSupportedException cnse)
		{
			System.out.println("Cloning not allowed");
			return this;
		}
	}
}


class CloneDemo2
{
	public static void main(String args[])
	{
		TestClone22 x1 = new TestClone22();

		TestClone22 x2;

		x1.a = 10;
		x1.b = 20.98;

		// Here, clone() is called directly	
		x2 = (TestClone22) x1.clone(); // clone x1.

		System.out.println();

		System.out.println("Cloning....");

		System.out.println("x1 : " + x1.a + " " + x1.b);

		System.out.println();

		System.out.println("After Cloning....");

		System.out.println("x2 : " + x2.a + " " + x2.b);
	}
}