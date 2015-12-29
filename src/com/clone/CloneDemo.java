package com.clone;

/**
The object returned by clone() must be cast into its appropriate type (TestClone)
*/

class TestClone implements Cloneable
{
	int a;
	double b;

	// This method calls Object's clone().

	TestClone cTest()
	{
		try
		{
			// call clone in Object
			return (TestClone) super.clone();
		}
		catch(CloneNotSupportedException cnse)
		{
			System.out.println("Cloning not allowed");
			return this;
		}
	}
}


class CloneDemo
{
	public static void main(String args[])
	{
		TestClone x1 = new TestClone();

		TestClone x2;

		x1.a = 10;
		x1.b = 20.98;

		x2 = x1.cTest(); // clone x1.

		System.out.println();

		System.out.println("Cloning....");

		System.out.println("x1 : " + x1.a + " " + x1.b);

		System.out.println();

		System.out.println("After Cloning....");

		System.out.println("x2 : " + x2.a + " " + x2.b);
	}
}