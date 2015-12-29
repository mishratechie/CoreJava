//Refer 3.jpg for question

package com.barclays;

public class prob3 {

public static void main(String[] args) {
	
	//int[] A={1,5,3,3,7};
	int[] A={1,3,5,3,4};
	
	System.out.println(function(A));
	
}


private static boolean function(int[] data) {
    int max = data[0], maxIndex = 0;

    //find the maximum element in the array
    for(int i=0;i<data.length;i++)
    {
        if(data[i] > max)
        {
            max = data[i];
            maxIndex = i;
        }
    }

    //check whether all the elements before max are less than it
    // if not you need more swaps to sort
    for(int j=0;j<maxIndex;j++)
    {
        if(data[j]>max)
            return false;
    }


    //check what is next smallest element
    for(int j=maxIndex+1;j<data.length-1;j++)
    {
        if(!(max > data[j] && data[j+1] <data[j]))
            return false;
    }

    return true;
}
}