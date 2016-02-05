package com.generic;

public class GenericMethodTest
{
   // generic method printArray                         
   public static < E > void printArray( E[] inputArray )
   {
      // Display array elements              
         for ( E element : inputArray ){        
            System.out.printf( "%s ", element );
         }
         System.out.println();
    }

    public static void main( String args[] )
    {
    	
    	
        // Create arrays of Integer, Double and Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println( "Array integerArray contains:" );
        GenericMethodTest.printArray( intArray  ); // pass an Integer array

        System.out.println( "\nArray doubleArray contains:" );
        GenericMethodTest.printArray( doubleArray ); // pass a Double array

        System.out.println( "\nArray characterArray contains:" );
        GenericMethodTest.printArray( charArray ); // pass a Character array
    } 
    
    /*
     * The goal of implementing Generics is finding bugs in compile-time, other than in run-time.
     *  Finding bugs in compile-time can save time for debugging java program, 
     *  because compile-time bugs are much easier to find and fix. 
     *  Generic types only exist in compile-time.
     *  This fact is the most important thing to remember for learning Java Generics.
     *  http://www.programcreek.com/2012/04/why-do-we-need-generic-types-in-java/
     *  */
}