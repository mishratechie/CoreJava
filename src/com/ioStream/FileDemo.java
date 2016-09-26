package com.ioStream;
import java.io.File;

class FileDemo
{
    static void p(String s)
    {
		System.out.println(s);
		
    }

    public static void main(String args[])
    {
		File f = new File("ABC.txt");
		
		p("File Name : " + f.getName());

		p("Path : " + f.getPath());

		p("Abs Path : " + f.getAbsolutePath());

		p("Parent : " + f.getParent());

		p(f.exists() ? " exists " : " does not exists. ");

		p(f.canWrite() ? " is writeable " : " is not writeable.");

		p(f.canRead() ? " is readable " : " is not readable.");

		p("Is " + (f.isDirectory() ? " " : " not "+ " a directory"));

		p(f.isFile() ? " is normal file " : " might be a named pipe");

		p(f.isAbsolute() ? " is absolute " : " is not absolute");

		p("File last modified :" + f.lastModified());

		p("File size :" + f.length() + " Bytes");
    }
}