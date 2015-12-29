package com.StringBufferBuilder;


import java.util.StringTokenizer;

public class Stringtok {

	
	
	public static void main(String[] args) {
		String input="hello,jow,are,you";
		
		StringTokenizer s = new StringTokenizer(input, ",");
		while(s.hasMoreTokens())
		{
			System.out.println("elements : "+s.nextToken()+"\n");
		}
		
		
	}
}
