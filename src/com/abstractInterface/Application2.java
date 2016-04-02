package com.abstractInterface;

interface IFruit
{
    public String myTYPE = "Apple";
}

class Fruit1 implements IFruit
{
	public void test()
	{
		//By default all the variables declared in the interface will be static & Final
		String s=Fruit1.myTYPE;
		System.out.println("From fruit1"+s);
	}
}

public class Application2 {
    public static void main(String[] args) {
        System.out.println(Fruit1.myTYPE);
        
    }
}
