package com.StringBufferBuilder;

public class StringTest {

	
	public static void main(String[] args) {
		//immutable = object =Hello + Guest
		String myString= "Hello";
		System.out.println("myString : " + myString);
		myString=myString+" Guest";
		System.out.println("myString :" +myString);
		
		//mutable
		StringBuffer str= new StringBuffer("Good"); 
		str.append(" Morning");
		str.append(5);
		str.append("hello");
		str.append("Test");
		System.out.println("strValue" + str);
		
				
	}
}
