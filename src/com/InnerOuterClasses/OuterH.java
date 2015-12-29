package com.InnerOuterClasses;
class  OuterH
{
		int x;
		static int y;

		OuterH()
		{
				x = 10;
				y = 20;											// Static members can also be initialized inside a constructor
	
				System.out.println("Inside outer class constructor....");

				Inner in = new Inner();				// Objects for the Inner static class can be created	
				in.innerMethod();
		}

		// Inner class CAN BE declared STATIC ONLY outside a constructor / method....
		static class Inner
		{
				int a;

				Inner()
				{
						a = 25;
				}

				void innerMethod()
				{
						System.out.println("Inside inner class method...."+y);			// static members can be referenced from non-static members

						Inner1 in1 = new Inner1();														// Objects for the Inner static class can be created	
						in1.innerMethod1();
				}

				static class Inner1																			// Cascading inner classes / Cascading inner static classes
				{
						int a;

						Inner1()
						{
								a = 25;
						}

						void innerMethod1()
						{
								System.out.println("Inside inner inner class method...."+a);			// static members can be referenced from non-static members
						}
				};
		};

		public static void main(String[] args) 
		{
				new OuterH();
		}
}