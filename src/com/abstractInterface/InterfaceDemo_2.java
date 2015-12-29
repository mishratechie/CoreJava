package com.abstractInterface;

// interfaces

interface Aaa
{
	  void callback(int a);
}

class Bbb implements Aaa
{
	   public void callback(int b)
	   {
				System.out.println("Callback called with : " + b);	   
	   }

	   void methodB()
	   {
				System.out.println("Other method of Child Class...");	   
	   }
}

class InterfaceDemo_2
{
		public static void main(String[] args) 
		{
				Bbb b = new Bbb();

				b.callback(42);
				b.methodB();
		}
}