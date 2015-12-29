package com.oops;

/** Example shows garbage collector in action
Note that the finalize() method of object GC1
runs without being specifically called and that
the id's of garbage collected objects are not
always sequential.
*/

class TestGC {

	
	public static void main(String[] args) {

	//float f=3.6f;	
	
		/*
		 *  accepted
	

In Java, when you type a decimal number as 3.6, its interpreted as a double.
double is a 64-bit precision IEEE 754 floating point, 
while float is a 32-bit precision IEEE 754 floating point. 
 As a float is less precise than a double, the conversion cannot be performed implicitly.

If you want to create a float, you should end your number with f (i.e.: 3.6f).
		 * 
		 * */
	Runtime rt = Runtime.getRuntime();
	
	System.out.println("Available Free Memory: " + rt.freeMemory());
	
	for(int i=0; i<10000; i++ ) {
	GC1 x = new GC1(i);
	}

	System.out.println("Free Memory before call to gc(): " +rt.freeMemory());
	System.runFinalization();
	System.gc();
	System.out.println(" Free Memory after call to gc(): " +
	rt.freeMemory());

	}
}

class GC1 {

	String str;
	int id;

	GC1(int i) {
		this.str = new String("abcdefghijklmnopqrstuvwxyz");
		this.id = i;
	}

	protected void finalize() {
		System.out.println("GC1 object " + id + " has been finalized.");
	}

}