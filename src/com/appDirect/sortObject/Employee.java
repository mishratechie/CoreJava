package com.appDirect.sortObject;

import java.util.Comparator;

/**
 * Created by Ashutosh on 9/11/2016.
 */
public class Employee implements Comparable<Employee> {


    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;

    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    //https://www.mkyong.com/java/java-object-sorting-example-comparable-and-comparator/
    @Override
    public int compareTo(Employee obj) {

        int compareid = obj.getId();//e1 obj id
       /* System.out.println("compareid "+compareid);
        System.out.println("this.id : " +this.id);
        System.out.println("return : "+(this.id-compareid));*/

        int returnValue = this.id - compareid;

        //if a -ve return value appears  obj2 is bigger than obj1
        //if a +ve return value appears obj1 is bigger than obj2
        //zero return value obj1 and obj2 both are same
        System.out.println("returnValue" + returnValue);
        return returnValue;
    }





}
