package com.abstractInterface;

class Fruit {
    protected static String name = "Sue";
}

class Apple extends Fruit {
    
}

public class Application1 {
    public static void main(String[] args) {
        System.out.println(Apple.name);
    }
}
