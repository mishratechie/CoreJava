package com.PrintFileWithExtension;

import java.io.*;


class DirListOnly
{
    public static void main(String args[])
    {
		String dirname = "C:/Reports/";//provide dir location
		

		File f = new File(dirname);

		FilenameFilter only = new OnlyExt("xml");

		String s[] = f.list(only);

		for(int i=0; i<s.length; i++)
		{
			System.out.println(s[i]);
		}
    }
}

//this need onlyExt.java