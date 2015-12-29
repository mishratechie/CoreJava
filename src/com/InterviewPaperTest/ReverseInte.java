package com.InterviewPaperTest;

public class ReverseInte {

	
	
	public static void main(String[] args) {
		
		int input=1215;
		
		
		int reversedNum=0;
		int remainder=0;
		while (input > 0) {
			
			remainder=input % 10;
		    reversedNum = (reversedNum * 10) + (remainder);
		    input = input/10;   
		}
		System.out.println(reversedNum);
	}
	
}
