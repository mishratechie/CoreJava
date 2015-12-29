package com.collections;
import java.util.*;

class TreeMapDemo
{
	public static void main(String[] args) 
	{
		//create a Tree map
		TreeMap tm = new TreeMap();

		//put elements to Tree map
		tm.put("Aloke", new Double(3434.34));
        tm.put("Krishan", new Double(123.23));
        tm.put("Raman", new Double(1378.00));
        tm.put("Gopi", new Double(99.25));
        tm.put("Chiranjeevi", new Double(-19.08));
        
		//get a set of entries
		Set set = tm.entrySet();

		//get an iterator
		Iterator it = set.iterator();

		//display elements
		while(it.hasNext())
		{
			Map.Entry me = (Map.Entry)it.next();

			System.out.print(me.getKey() + "  :  ");

			System.out.println(me.getValue());
		}

		System.out.println();
		
		// Deposit 1000 into Gopi's account
		double balance=((Double)tm.get("Gopi")).doubleValue();

		tm.put("Gopi", new Double(balance+1000));
    
		System.out.println("Gopi's new balance : " + tm.get("Gopi"));
	}
}