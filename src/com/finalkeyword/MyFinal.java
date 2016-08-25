package com.finalkeyword;

/**
 * Created by Ashutosh on 25-Aug-16.
 * Please contact mishra.techie@gmail.com with your queries
 */

/*
* When final is used with non-primitive variables (Note that non-primitive variables are always references to objects in Java),
* the members of the referred object can be changed.
* final for non-primitive variables just mean that they cannot be changed to refer to any other object
* */
class Test1 {
    int i = 10;
}

public class MyFinal {
    public static void main(String args[]) {
        final Test1 t1 = new Test1();
        t1.i = 30;  // Works
    }
}