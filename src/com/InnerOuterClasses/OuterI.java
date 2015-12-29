package com.InnerOuterClasses;
class OuterI
{
		int x;
		static int y;

		OuterI()
		{
				x = 10;
				y = 20;											// Static members can also be initialized inside a constructor
	
				System.out.println("Inside outer class constructor....");

				// OuterI.Inner is abstract : CANNOT BE INSTANIATED
//				Inner in = new Inner();				
//				in.innerMethodB();
		}

		// Inner class CAN BE declared ABSTRACT ONLY outside a constructor / method....
		abstract class Inner
		{
				int a;

				Inner()
				{
						a = 25;
				}

				// Inner classes CANNOT HAVE A STATIC DECLARATIONS
//				static void innerMethodA()			
//				{
//						System.out.println("Inside inner class method...."+y);
//				}

				void innerMethodB()
				{
						System.out.println("Inside inner class method...."+y);			// static members can be referenced from non-static members
				}
		};

		public static void main(String[] args) 
		{
				new OuterI();
		}
}

/*				static class Inner1																			// Cascading inner classes / Cascading inner static classes
				{
						int a;

						Inner1()
						{
								a = 25;
						}

						void innerMethod1()
						{
								System.out.println("Inside inner class method...."+a);			// static members can be referenced from non-static members
						}
				};
*/