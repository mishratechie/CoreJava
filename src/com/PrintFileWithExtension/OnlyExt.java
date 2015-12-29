package com.PrintFileWithExtension;

import java.io.*;

class OnlyExt implements FilenameFilter
{
    String ext;

    public OnlyExt(String ext)
    {
		this.ext = "." + ext;
    }		

    public boolean accept(File dir, String name)
    {
		return name.endsWith(ext);
    }			
}