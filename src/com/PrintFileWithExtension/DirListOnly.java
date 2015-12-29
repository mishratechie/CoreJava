package com.PrintFileWithExtension;

import java.io.*;


class DirListOnly
{
    public static void main(String args[])
    {
		String dirname = "C:/Reports/GeneratedReports/14-8-14/MainInt_SimpleApp_Scenario_Iteration1/MainInt_SimpleApp_Scenario_Iteration1_0_Results_20-08-2014_files";//provide dir location
		

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