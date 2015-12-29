package com.staticJava;



class StaticDemotrial
{
	//Normal variable
	int a =10;
	
	//Static variable
	static int b;

	//StaticBlock
	static
    {
		System.out.println("Inside static Block");
		b = 20;
	  //a = 20;
	}

	//Static Method
	static void method1()
	{
		System.out.println("Inside static method1()");
	}
	//Normal Method 
	void method2()
	{
		System.out.println("Inside normal method2()"+b);
	}

	
}

class StaticExample1 extends StaticDemotrial{
	
	public static void main(String[] args) 
	{
		System.out.println("inside main()");

		//Static Variable Gets initialized first than normal variable
		//Static Blocks Gets initialized first than any other block
		
		//Printing the value of static variable
		System.out.println(" b value is : "+ StaticDemotrial.b);
		
		//Calling the static method
		StaticDemotrial.method1();
		
		//Creating object of class to call normal methods
		StaticDemotrial sd = new StaticDemotrial();
		sd.method2();
			 
	
		System.out.println(" a value is : "+ sd.a);


		

		
		
    }
	
	
}