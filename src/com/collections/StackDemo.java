package com.collections;
import java.util.*;

class StackDemo 
{
	static void showpush(Stack<Integer> st, int a)
	{
		st.push(new Integer(a));
		System.out.println("push("+a+")");
		System.out.println("stack:"+st);
	}

	static void showpop(Stack<Integer> st)
	{
		System.out.println("pop->");
		Integer a=(Integer)st.pop();
		System.out.println("a : " + a);
		System.out.println("stack:"+st);
	}

	public static void main(String args[])
	{
		Stack<Integer> st=new Stack<Integer>();

		showpush(st,42);
		showpush(st,20);
		showpush(st,51);

		showpop(st);
		showpop(st);
		showpop(st);
		
		try
		{
			showpop(st);
		}
		catch(EmptyStackException e)
		{
			System.out.println("empty stack");
		}
	}
}