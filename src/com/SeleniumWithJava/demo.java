package com.SeleniumWithJava;


public class demo {

	public static void print()
	{
		System.out.println("hey...you have successfully called print() method:)");
	}
	
	public static void main(String [] args)
	{
		print();  // <-- 1st way to call a method(by using name directly)
		demo.print(); // <-- 2nd way to call a method(by using class name as a reference)
	
	    
		
		double [] b = new double[2];
		System.out.println(b[0]);
	
	}
	
}
