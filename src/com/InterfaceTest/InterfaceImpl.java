package com.InterfaceTest;

public class InterfaceImpl implements MyInterface {

	@Override
	public void add() {
		System.out.println("Addition");
		
	}

	@Override
	public void subtarct() {
		System.out.println("Subtraction");
		
	}

	@Override
	public void multiply() {

		System.out.println("Multiplication");
	}

		
	public static void main(String [] args) throws Exception{
			
			try{
				Class c = Class.forName("com.InterfaceTest.InterfaceImpl");
				MyInterface i = (MyInterface)c.newInstance();
				i.add();
				i.subtarct();
				i.multiply();

			}
			catch(ClassNotFoundException e)
			{
				System.out.println(e);
			}
		
		}

	}

	

