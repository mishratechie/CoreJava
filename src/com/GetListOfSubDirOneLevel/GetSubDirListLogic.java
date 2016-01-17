package com.GetListOfSubDirOneLevel;

import java.io.File;
import java.util.ArrayList;


//This is only one level of Directory -Wont fetch Sub directories
public class GetSubDirListLogic {

		
	public static void main(String[] args) {
		
		
		ArrayList<String> catchAbsPath=new ArrayList<String>();
		catchAbsPath=getSubDirList("D:/MyLatestDir2");
		
		System.out.println("From Array List");
		for (String value : catchAbsPath) {
		    System.out.print(value);
		    System.out.print("\n");
		}
	}
	
	public static ArrayList<String> getSubDirList(String directoryName){
				 
				
				ArrayList<String> catchAbsPath=new ArrayList<String>();
				String absPath=null;
				
				File directory = new File(directoryName);
				
				//get all the files from a directory
				File[] fList = directory.listFiles();
				 
				for (File file : fList){
						if (file.isDirectory()){
							
							System.out.println(file.getName());
							absPath=file.getAbsolutePath();
							catchAbsPath.add(absPath);
							
							
							}//if
						
					}//for
				
				return catchAbsPath;
			}//getSubDirList
			
}
