package com.day_10_part_02_or_11_or_8;

import java.util.Scanner;

public class Demo_26_FunctionsAdds2 {
	
	public void add2(int p, int q) { 
		// void = output return type
		// inside method we pass the input
		System.out.println(p-q); // for void only print no return type
		// we cant call this or use this method in the main class
		// we need to define this method in the another class, or make it static 
		
	}
	
	
	
	
	public static void add(int a, int b) { 
		// void = output return type
		// inside method we pass the input
		System.out.println(a+b); // for void only print no return type
		
	}
	
	public static int add1(int a, int b) { 
// here static means we can call this method without creating the object/ instance of the class
// so static is used for class level, we can call the static methods by the class name only or withh obj ref also
		
		// int = output return type
		// inside method we pass the input
		
	   //	System.out.println(a+b);
		return a+b; // for int both print and return type is applicable
		
	}
	
	
	public static void main(String[] args) {
		
		// call the method add
		//add(6, 7);
		
        //add1(8, 9);
        // for int return type we cant print the output without syso
        // we have to use syso any store it again the res in to a variables
        
     //  int res =    add1(7, 17);
	 //	System.out.println(res);
	
		
		System.out.println(add1(7, 8));
System.out.println();
	}
}
