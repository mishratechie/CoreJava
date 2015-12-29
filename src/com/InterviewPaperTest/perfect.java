package com.InterviewPaperTest;

import java.util.Scanner;

//sum of factors of a number is twice the number itself 
//then such number is known as perfect number
//6 and 28 are perfect numbers
public class perfect {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a number to find if perfect or not :");
		
		int num=s.nextInt();
		int sum=0;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				sum=sum+i;
			
		}
		if(sum==(2*num))
			System.out.println("given number is perfect");
		else
			System.out.println("given number is not perfect");
	}
	
}
	