package com.collections;
import java.util.*;

public class BitSetDemo
{
	public static void main(String[] args) 
	{

		BitSet b1 = new BitSet(20);
		b1.set(1);
		b1.set(4);

		BitSet  b2 = new BitSet(20);
		b2.set(4);
		b2.set(5);

		// display the contents of these two Bitsets
		System.out.println("Bits 1 = " + b1.toString());
        System.out.println("Bits 2 = " + b2.toString());

		//test for equality of the two BitSets
		if(b1.equals(b2))
			 System.out.println("Bits1 == bits2\r\n");
	    else
			System.out.println("Bits1 != bits2\r\n");

		//create a clone and then test for equality
		BitSet cloneBits = (BitSet) b1.clone();

		if(b1.equals(cloneBits))
		{
			System.out.println("Bits1 == cloned Bits ");
		}
		else
		{
			System.out.println("Bits 1 != cloned Bits");
		}

		//logically and the first two Bitsets
		b1.and(b2);
		System.out.println("ANDing Bits1 and Bits2");

		//and display tha resulting BitSet
		System.out.println("Bits1 = " + b1.toString());
	}
}