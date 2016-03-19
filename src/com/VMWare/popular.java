package com.VMWare;

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
