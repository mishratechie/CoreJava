package com.barclays;

public class prob1 {

	
	public static void main(String[] args) {
		
		/*// */
		System.out.println(solution(3,7));
	}
	
	
	public static int solution(int a, int b){
		int multiplication = a*b;
		int countOfBits = 0;
		
		while(multiplication>0){
			if((multiplication & 1)==1){
				countOfBits++;
			}
			multiplication = multiplication >> 1;
		}
		return countOfBits;
		
}
}
