
package com.InnerOuterClasses;
class OuterG
{
		int x;
		static int y;

		OuterG()
		{
			x = 10;
			y = 20;											// Static members can also be initialized inside a constructor

			System.out.println("Inside outer class constructor....");

			// Objects for the Inner static class can be created
			Inner in = new Inner();					
			in.innerMethod();

			// Objects for the Inner static class can be created
			Inner1 in1 = new Inner1();
			in1.innerMethod1();
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
			}
		};

		static class Inner1
		{
			int a;

			Inner1()
			{
				a = 25;
			}

			void innerMethod1()
			{
				System.out.println("Inside inner1 class method...."+y);			// static members can be referenced from non-static members
			}
		};

		public static void main(String[] args) 
		{
			new OuterG();
		}
}