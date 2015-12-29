package com.InnerOuterClasses;
class  OuterJ
{
	int x;
	static int y;

	OuterJ()
	{
		x = 10;
		y = 20;	// Static members can also be initialized inside a constructor

		System.out.println("Inside outer class constructor....");

		AnotherInner in = new AnotherInner();
		in.anotherInnerMethod();
	}

	// Inner class CAN BE declared ABSTRACT ONLY outside a constructor / method....
	abstract class Inner
	{
		int a;
		Inner()
		{
			a = 25;
		}

		abstract void abstractMethod();

		void innerMethod()
		{
			System.out.println("Inside inner class method...."+y);			// static members can be referenced from non-static members
		}
	};

	class AnotherInner extends Inner
	{
		void abstractMethod()
		{
			System.out.println("Inside an ANOTHER INNER CLASS implementing super class abstract method");
		}

		void anotherInnerMethod()
		{
			Inner ai = new AnotherInner();
			ai.innerMethod();
			ai.abstractMethod();
		}
	};

	public static void main(String[] args) 
	{
		new OuterJ();
	}
}