package com.oops;

//same class -same name -signatures
class ParentClass 
{
	  int x =10;

      public void pmethod()
	  {
		   System.out.println("Inside Parent class");
	   }

	  public void pmethod(int a)
	  {
		   System.out.println("Int value is  : " + a);
	   }

	  char pmethod(char c)
	  {
		   //System.out.println("Character is : " + c);
		   return c;
	   }

}

class ChildClass extends ParentClass
{
	     int y = 20;

		 public void cmethod()
	    {
				System.out.println("Inside Child class");
		 } 

		 public void pmethod()
	    {
				System.out.println("Inside Child class...");
				System.out.println("Overriding super class pmethod()");
		 } 

};

class MethodOverloading
{
	public static void main(String[] args) 
	{
		char c1;

		ChildClass cc = new ChildClass();

		cc.cmethod();
		cc.pmethod();

		ParentClass pc = new ParentClass();
		pc.pmethod();
		pc.pmethod(20);
		c1 = pc.pmethod('h');

		System.out.println("character is : " + c1);


		System.out.println("x value is : " + cc.x);
		System.out.println("y value is : " + cc.y);
	}
}
