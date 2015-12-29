package com.PrintFileWithExtension;

import java.io.*;


class CopyOfDirListOnly
{
    public static void main(String args[])
    {
		String dirname = "D:/Ashu-Personal/Picks/MarriageTrip/200Selected/CD4-101/1";//provide dir location
		

		File f = new File(dirname);

		FilenameFilter only = new OnlyExt("JPG");

		String s[] = f.list(only);

		for(int i=0; i<s.length; i++)
		{
			System.out.println(s[i]);
		}
    }
}

//this need onlyExt.java