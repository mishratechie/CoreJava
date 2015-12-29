package com.InnerOuterClasses;
class  OuterE
{
		int x;
		static int y;

		OuterE()
		{
				x = 10;
				y = 20;											// Static members can also be initialized inside a constructor
	
				System.out.println("Inside outer class constructor....");
		}

		void outerMethod()
		{
				// Inner class CANNOT BE STATIC inside a method.... ("ILLEGAL START OF EXPRESSION")
				/*static*/ class Inner
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

				//Inner in = new Inner();
				//in.innerMethod();
		}

		public static void main(String[] args) 
		{
				new OuterD();
		}
}