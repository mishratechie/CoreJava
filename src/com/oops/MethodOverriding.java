package com.oops;


class PPParentClass 
{
   int x =10;

	public void pmethod()
	{
		System.out.println("Inside Parent class");
	}

	public void display()
	{
			System.out.println("Inside parent class display() : "+(x*x));
	} 
}

class CCChildClass extends PPParentClass
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

	public void calculate()
	{
		System.out.println("Inside Child class : "+(x*y));
	} 

};

class MethodOverriding
{
	public static void main(String[] args) 
	{
		CCChildClass cc = new CCChildClass();

		cc.cmethod();
		cc.pmethod();
		cc.display();
		cc.calculate();

		System.out.println("------------------------");
		PPParentClass pc = new PPParentClass();

		//pc.cmethod();
		pc.pmethod();
		pc.display();
		//pc.calculate();

//		CCChildClass cc1 = new PPParentClass();
		System.out.println("------------------------");
		System.out.println("");

		PPParentClass cp = new CCChildClass();
//		cp.cmethod();
		cp.pmethod();
		cp.display();
//		cp.calculate();

		System.out.println("x value is : " + cc.x);
		System.out.println("y value is : " + cc.y);
	}
}
