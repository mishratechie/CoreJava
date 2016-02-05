
package com.collections;
import java.util.*;

class ArrayListToArrayDemo
{
	public static void main(String[] args) 
	{
		// create an ArrayList
		ArrayList<Integer> al = new ArrayList<Integer>();

		// Initial size of an ArrayList
		System.out.println("Initial size of al : " + al.size());

		// add elements to the ArrayList
		al.add(new Integer(1));
		al.add(new Integer(2));
		al.add(new Integer(3));
		al.add(new Integer(4));
		al.add(new Integer(5));

		System.out.println("Size of al after additions : " + al.size());

		// Display ArrayList
		System.out.println("Contents of al : " + al);

		// get array
		Object a[] = al.toArray();
		int sum = 0;

		// sum the array
		for(int i=0; i<a.length; i++)
			sum += ((Integer)a[i]).intValue();	

		// The sum value
		System.out.println("The sum is : " + sum);
	}
}