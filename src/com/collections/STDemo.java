package com.collections;
import java.util.*;

class STDemo 
{
	static String in =	"Title=java: The Complete Reference;"+
						"Author=Naughton and schildt;" +
						"Publisher = Osborne/McGraw-Hill;" +
						"Copyright=1999;";

	public static void main(String[] args) 
	{
		StringTokenizer st = new StringTokenizer(in,"=;");

		while(st.hasMoreTokens())
		{
			String key = st.nextToken();

			String val = st.nextToken();

			System.out.println(key + "\t" + val);
		}
	}
}