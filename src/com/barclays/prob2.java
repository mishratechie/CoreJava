package com.barclays;

public class prob2 {

	
	public static void main(String[] args) {
		
		System.out.println(solution(24));
	}
	
public static int solution(int N){
		
		int power=0;
		int div=1;

		do{
			power++;
		}while(N%(int)Math.pow(2,power)==0);
		
		return power-1;
		
	}
}
