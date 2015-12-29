package com.oops;

class person  
{  
    int age;  
    String name;  
    String address;  
    void input()  
    {  
        age=21;  
        name="tkhts";  
        address="delhi";  
    }  
    void print()  
    {  
        System.out.println("name = "+name);  
        System.out.println("age = "+age);  
        System.out.println("address = "+address);  
        System.out.println("____________________");
    }  
}  
class Emp extends person  
{  
    int empno;  
    int deptno;  
	    void input()  
	    {  
	        super.input();  
	        empno=01;  
	        deptno=101;  
	    }  
	    void print()  
	    {  
	        super.print();  
	        System.out.println("employ no = "+empno);  
	        System.out.println("dept no. = "+deptno);
	        System.out.println("____________________");
	    }  
}  
class Customer extends person  
{  
    int custId;  
    int custno;  
	    void input()  
	    {  
	        //super.input();  
	        name="Techknow";  
	        age=100;  
	        address="mumbai";  
	        custno=02;  
	        custId=1001;  
	    }  
	    void print()  
	    {  
	        super.print();  
	        System.out.println("custno = "+custno);  
	        System.out.println("custId = "+custId);
	        System.out.println("____________________");
	    }  
}  
public class TestOverriding  
{  
	    public static void main(String s1[])  
	    {  
	        Emp emp=new Emp();  
	        emp.input();  
	        emp.print();
	        
	        
	        Customer customer=new Customer();  
	        customer.input();  
	        customer.print(); 
	        
	        
	        person p=new person();
	        p.input();
	        p.print();
	        
	       
	       
	        	        
	        
	        
	    }  
}  