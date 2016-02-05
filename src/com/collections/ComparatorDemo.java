package com.collections;
import java.util.*;

/*
 * int compare(Object obj1, Object obj2)

obj1 and obj2 are the objects to be compared. 
This method returns zero if the objects are equal. It returns a positive value if obj1 is greater than obj2. Otherwise, a negative value is returned.

By overriding compare( ), you can alter the way that objects are ordered. 
For example, to sort in reverse order, you can create a comparator that reverses the outcome of a comparison
 * 
 * */
// A reverse comparator of strings
class MyComp implements Comparator<Object>
{
	public int compare(Object a, Object b)
	{
		String s1, s2;

		s1 = (String) a;
		s2 = (String) b;

		// reverse the comparison
		return s2.compareTo(s1);
	}
}

class ComparatorDemo
{
	public static void main(String[] args) 
	{
		// create a tree set
		TreeSet<Object> ts = new TreeSet<Object>(new MyComp());

		// add elements to the tree set
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");

		// use iterator to display contents of 'ts'		
		System.out.println("Original contents of ts : ");

		Iterator<Object> itr = ts.iterator();

		// Display elements
		while(itr.hasNext())
		{
			Object obj = itr.next();
			System.out.print(obj + " ");
		}

		System.out.println();
	}
}