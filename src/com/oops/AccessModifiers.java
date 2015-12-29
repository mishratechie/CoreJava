package com.oops;


class AccessModifiers
{
	int a ;
	private int b;
	protected int c;
	public int d;

	AccessModifiers()
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

	public static void main(String[] args) 
	{
		System.out.println("inside main()");

		AccessModifiers e = new AccessModifiers();

		e.method1();
		e.method2();
		e.method3();

		System.out.println(" a value is : "+ e.a);
		System.out.println(" b value is : "+ e.b);
		System.out.println(" c value is : "+ e.c);
		System.out.println(" d value is : "+ e.d);

	}
}
