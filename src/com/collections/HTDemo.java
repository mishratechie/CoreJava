package com.collections;
import java.util.*;

// Hash Table Demonstration

class HTDemo 
{
	public static void main(String[] args) 
	{
		Hashtable ht = new Hashtable();

		Enumeration names;
		String str;
		double bal;

		ht.put("John",new Double(12.585));
		ht.put("Sam",new Double(1358.00));
		ht.put("Rupa",new Double(15.22));
		ht.put("Kishore",new Double(-19.25));

		//show all elements in the hash table
		names = ht.keys();

		while(names.hasMoreElements())
		{
			str = (String)names.nextElement();
			System.out.println(str + " " +ht.get(str));
		}

		System.out.println();

		// Deposit 1000 into John's Account
		bal = ((Double)ht.get("John")).doubleValue();

		ht.put("John", new Double(bal+1000));

		System.out.println("John's new Balance : " + ht.get("John"));
	}
}