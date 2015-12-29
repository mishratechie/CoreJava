package com.ioStream;
import java.io.*;

class CountSize  
{
   public static void main( String args[] ) throws IOException, FileNotFoundException
   {
      try
      {
         Reader in = new FileReader("C:/Users/LAB/workspace/CoreJava/src/com/ioStream/Exam.txt");
         
         int total;
         
         for ( total = 0; in.read() != -1; total++)
			 ;

		 System.out.println("Number of characters read from the file Exam.txt : " + total );
      }
      catch ( FileNotFoundException fileProblem )
      {
         System.err.println( "File not found" );
         throw fileProblem;
      }
      catch ( IOException ioProblem )
      {
         System.err.println( "IO problem" );
         throw ioProblem;
      }
   }
}