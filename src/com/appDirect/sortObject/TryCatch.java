package com.appDirect.sortObject;

/**
 * Created by Ashutosh on 9/21/2016.
 */
public class TryCatch {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println("A");
            System.out.println(TryCatch.hello());//--X
            System.out.println("B");
        } catch (Exception e) {
            System.out.println("C");
        }
    }

    public static String hello() throws Exception {
        try {
            System.out.println("1");
            throw new Exception();
        }
        finally {
            System.out.println("3");
            return "X";
        }
    }
}