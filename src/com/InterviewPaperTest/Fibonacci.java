package com.InterviewPaperTest;

class Fibonacci{

    public static void main(String args[]){

        int num = 10;                   

        System.out.println("*****Fibonacci Series*****");

        int f1, f2=0, f3=1;

        for(int i=1;i<=num;i++){

           System.out.print(" "+f3+" ");

           f1 = f2;

           f2 = f3;

           f3 = f1 + f2;

        }

 }

}