package com.InterviewPaperTest;

public class wordRevbyMethod {
	
	public static void main(String[] args) {
		String source = "Hello World";

		
		
		for(String part : source.split(" ")) 
		{
			StringBuffer s=new StringBuffer(part);
			System.out.print(s.reverse().toString());
		    System.out.print(" ");
		}
	}
	
}
