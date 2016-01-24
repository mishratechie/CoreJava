package com.PrintFileWithExtension;

import java.io.*;


class CopyOfDirListOnly
{
    public static void main(String args[])
    {
		String dirname = "C:/Users/Ashutosh/Pictures/2015/2015-11-08";//provide dir location
		

		File f = new File(dirname);

		FilenameFilter only = new OnlyExt("JPG");//Extension of filename which you want to be printed

		String s[] = f.list(only);

		for(int i=0; i<s.length; i++)
		{
			System.out.println(s[i]);
		}
    }
}

//this need onlyExt.java