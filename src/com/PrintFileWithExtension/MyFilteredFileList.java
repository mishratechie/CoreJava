package com.PrintFileWithExtension;

import java.io.File;

import java.io.File;
import java.io.FilenameFilter;
 
public class MyFilteredFileList {
     
    public static void main(String a[]){
        File file = new File("C:/Reports/GeneratedReports/14-8-14/MainInt_SimpleApp_Scenario_Iteration1/MainInt_SimpleApp_Scenario_Iteration1_0_Results_20-08-2014_files");
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
