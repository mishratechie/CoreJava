package com.InnerOuterClasses;
class  OuterL
{
	int x;
	static int y;

	OuterL()
	{
		x = 10;
		y = 20;											// Static members can also be initialized inside a constructor

		System.out.println("Inside outer class constructor....");

		Inner in = new Inner();
		in.innerMethod();
	}

//	Inner class CAN BE declared  both PRIVATE / PROTECTED ONLY outside a constructor / method....
	private class Inner
//	protected class Inner
	{
		int a;

		Inner()
		{
			a = 25;
		}

		void innerMethod()
		{
			System.out.println("Inside private inner class method...."+y);			// static members can be referenced from non-static members
			//System.out.println("Inside protected inner class method...."+y);			// static members can be referenced from non-static members
		}
	};

	public static void main(String[] args) 
	{
		new OuterL();
	}
}