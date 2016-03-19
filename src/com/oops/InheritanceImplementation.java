package com.oops;


class ParentClasss 
{
	   int x =10;

	   public void pmethod()
	   {
		   System.out.println("Inside Parent class");
	   }
}

class ChildClasss extends ParentClasss
{
	     int y = 20;

		 public void cmethod()
	     {
				System.out.println("Inside Child class");
		 } 
};

class InheritanceImplementation
{
	public static void main(String[] args) 
	{
		ChildClasss cc = new ChildClasss();

		cc.cmethod();
		cc.pmethod();

		System.out.println("x value is : " + cc.x);
		System.out.println("y value is : " + cc.y);
	}
}
