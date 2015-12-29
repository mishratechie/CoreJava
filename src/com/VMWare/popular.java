package com.VMWare;
/*
 * Fill in the function body

Given a list of test scores (as integers), return the most common score
of the test.  If there are ties, return the tied score that appears
first in the list.

You may assume that all values are integers and that there is at least one
score in the list.  Note that the list may be long.

For example:
-------------------------------
    Input:
    [1, 2, 3, 3]

    Return:
    3

There are two '3' scores, and only one '1' and '2', so we return 3.
-------------------------------

-------------------------------
    Input:
    [1, 2, 3, 4]

    Return:
    1

There is one of each score, so we return the first score, '1'.
 * */
import java.util.Scanner;

public class popular {

	
	public static void main(String[] args) {
	
		popular p=new popular();
	    int arr[] = {1,3,2,3,4};
      
	int famou=p.getPopularElement(arr);
	System.out.println(famou);
		
		
	}
	public int getPopularElement(int[] items)
	{
	  int count = 1, tempCount;
	  int popular = items[0];
	  int temp = 0;
	  for (int i = 0; i < (items.length - 1); i++)
	  {
	    temp = items[i];
	    tempCount = 0;
	    for (int j = 1; j < items.length; j++)
	    {
	      if (temp == items[j])
	        tempCount++;
	    }
	    if (tempCount > count)
	    {
	      popular = temp;
	      count = tempCount;
	    }
	  }
	  
	  System.out.println("Mr popular"+popular);
	  return popular;
	}
}
