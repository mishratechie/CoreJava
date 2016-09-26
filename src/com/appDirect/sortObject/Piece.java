package com.appDirect.sortObject;

/**
 * Created by Ashutosh on 9/13/2016.
 */

//Write a small piece of code that prints out all the numbers between 0 and 1,000,000,
// which are divisible by 1227?
public class Piece {

    public static void main(String[] args) {

        for(int i=0;i<10000;i++){

            if(i%1227==0){

                System.out.println("the number"+i);

            }

        }
    }
}

