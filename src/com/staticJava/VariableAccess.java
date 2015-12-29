package com.staticJava;

public class VariableAccess {

	static int a=10;
	int b=20;
	
	public static void main(String[] args) {
		
		System.out.println("hello insideMain");
		
		//no obj need to be created for a static variable to use
		System.out.println(a);
		
		//obj need to be created to access no static variable  b
		//System.out.println(b);//uncomment and learn error
		VariableAccess va=new VariableAccess();
		int catchvar=va.b;
		System.out.println(catchvar);
		
	}
	
}
