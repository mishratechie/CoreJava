package com.finalkeyword;

/*final*/ class FinalClass //un comment final here and find an error
{
	void method()
    {
		System.out.println("Inside the final Method...");
	}
}

class FinalClassDemo extends FinalClass
{
	public static void main(String[] args) 
	{
		FinalClass  fc = new FinalClass();
		fc.method();
	}
}
