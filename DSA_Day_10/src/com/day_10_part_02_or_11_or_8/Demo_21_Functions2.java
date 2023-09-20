package com.day_10_part_02_or_11_or_8;

import java.util.Scanner;

class HiHello{
	
	public static void hiBro1() { // defining the methods
		System.out.println("Hello through class obj ref");
	}
	

}

public class Demo_21_Functions2 {

	// create any nos. of functions and run / call it inside the main func

	
	// method 1
	// first define the func using static keywords , no need to create class
	
	public static void hiBro() { // defining the methods
		System.out.println("Hello through static methods");
	}
	
	public static void main(String[] args) { // main is also a methods
// now call the methods here , otherwise we we will not get the outputs
		
		System.out.println("Hello through main methods");

		hiBro(); // calling the methods
		
	//	hiBro1(); // this method cant call directly
		
		HiHello hiHello=new HiHello();
		hiHello.hiBro1();
		
	}
}
