package com.InnerOuterClasses;
class OuterD
{
	int x;
	static int y;

	OuterD()
	{
		x = 10;
		y = 20;											// Static members can also be initialized inside a constructor

		System.out.println("Inside outer class constructor....");

		// Inner class CANNOT BE STATIC inside a constructor.... ("ILLEGAL START OF EXPRESSION")
		/*static*/ class Inner
		{
			/*static*/ int a;

			Inner()
			{
				a = 25;
			}

			void innerMethod()
			{
				System.out.println("Inside inner class method...."+y);			// static members can be referenced from non-static members
			}
		};

		Inner in = new Inner();
		in.innerMethod();
	}

	public static void main(String[] args) 
	{
		new OuterD();
	}
}