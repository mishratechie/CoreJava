package com.abstractInterface;

// interfaces

interface Aa
{
	  void callback(int a);
}

class Bb implements Aa
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

class InterfaceDemo
{
		public static void main(String[] args) 
		{
				Bb b = new Bb();

				b.callback(42);
				b.methodB();

				

						}
}