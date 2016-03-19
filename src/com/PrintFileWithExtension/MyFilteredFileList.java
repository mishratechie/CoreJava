package com.PrintFileWithExtension;

import java.io.File;

import java.io.FilenameFilter;
 
public class MyFilteredFileList {
     
    public static void main(String a[]){
        File file = new File("C:/Reports/");
        File[] files = file.listFiles(new FilenameFilter() {
             
            @Override
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".xml")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(File f:files){
            System.out.println(f.getName());
        }
    }
}
