package com.MarkerInterface;

public class MainDriverforInterface {

	public static void main(String[] args) {
		DemoClass demoClass = new DemoClass();
		if (demoClass instanceof DemoMarker)
		{
			System.out.println("DEMO Class is a instance of our marker interface");
		}
	}
	
}
