package com.PrintFileWithExtension;


//Best one
import java.io.File;
import java.util.ArrayList;

public class ListAllExtension {
	static ArrayList<String> aln=new ArrayList<String>();
	
	public static void main(String[] args) {
		//ListAllExtension an=new ListAllExtension();
		ArrayList<String> toCatch=new ArrayList<String>();
		
		File directoryName=new File("C:/Reports/GeneratedReports/14-8-14/");
		//walkin(directoryName);
		toCatch=walkin(directoryName);
		System.out.println(toCatch.size());
		
	}
	


	public static ArrayList<String> walkin(File dir) {
	                String pattern = ".xml"; //for example ".java"
	                String path1=null;
	                
	                File listFile[] = dir.listFiles();
	                if(listFile != null) {
                        for(int i=0; i<listFile.length; i++) {
                                if(listFile[i].isDirectory()) {
                                        walkin(listFile[i]);
                                } else {
                                        if(listFile[i].getName().endsWith(pattern))
                                        {
                                                //System.out.println(listFile[i].getPath());
                                                path1=listFile[i].getPath();
                                                aln.add(path1);
                                        }
                                }
                        }
                      
	                }//Main if
	                //System.out.println(aln.size()); 
	                return aln;
	        }


}
