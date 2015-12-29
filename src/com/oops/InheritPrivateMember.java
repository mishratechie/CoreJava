package com.oops;

class PParentClass
{
	int a ;
	private int b;
	protected int c;
	public int d;

	PParentClass()
    {
		 this.a= 10;
		 this.b= 20;
		 this.c= 30;
		 this.d= 40;
	}

	private void method1()
	{
				System.out.println("Inside Private method");
	}

	protected void method2()
	{
				System.out.println("Inside Protected method");
	}

	public void method3()
	{
				System.out.println("Inside Public method");
	}

	public void method4()
	{
				System.out.println("private b value is  : "+ b);
	}
}

class CChildClass extends PParentClass
{
	      public void cmethod()
	     {
				System.out.println("Inside Child class...");
		  }
}

class InheritPrivateMember
{
	public static void main(String[] args) 
	{
		System.out.println("inside main()");

		CChildClass cc = new CChildClass();

		//cc.method1();  //Uncomment and see the error. Private is not visible....this the error to be learned
		cc.method2();  // protected
		cc.method3();  // public
		cc.method4();  // public

		System.out.println(" a value is : "+ cc.a);
		//System.out.println(" b value is : "+ cc.b); // private
		System.out.println(" c value is : "+ cc.c);  // protected
		System.out.println(" d value is : "+ cc.d);  // public

	}
}
