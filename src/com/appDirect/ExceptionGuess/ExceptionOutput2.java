package com.appDirect.ExceptionGuess;

/**
 * Created by Ashutosh on 9/26/2016.
 */
public class ExceptionOutput2 {

    //Finally executes even before return.
    public static void main(String[] args) throws Exception {
        try {
            System.out.println("A");
            System.out.println(ExceptionOutput2.hello());
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
        catch (Exception e) {
            System.out.println("2");
            return "X";
        } finally {


            System.out.println("3");
            return "Y";//---------------------------Attention
        }
    }
}
