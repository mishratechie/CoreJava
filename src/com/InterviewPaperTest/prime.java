package com.InterviewPaperTest;

import java.util.Scanner;

public class prime {
//num should be divisible by 1 and itself
	
	private static Scanner scanner;

	public static void main(String[] args) {
	
		scanner = new Scanner(System.in);
		System.out.println("enter a no 2 check if it is prime or not");
		int num=scanner.nextInt();
        int flag=0;
		for(int d=2;d<num;d++)
		{
			if(num%d==0)
			{
				flag=1;
				break;
							
				
			}
			
		}
		if(flag==0)
			System.out.println("prime no");
		else
			System.out.println("not prime");
		
	
	}
	
	
	
}
