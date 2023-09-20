package com.day_10_part_02_or_11_or_8;

import java.util.Scanner;

public class Demo_24_Functions5Debugger {
	
	// now here we will see the flow of code and their calling using debugger in intelliJ Idea

	// 1
	public static void hiBro1() { // defining the methods
		System.out.println("Hello through direct static methods");
	}

	//2 using input through methods
	public static void hiBro2(String name) { // defining the methods
		System.out.println("Hello using method inputs, " + name);
	}

	public static void main(String[] args) { // main is also a methods

		System.out.println("Hello through main methods"); //21

		
		hiBro1();  // calling fuunc  // 24-11-12
		
		hiBro2("Shankar"); // calling fuunc // 26-16-17
		hiBro2("Durga"); // calling fuunc // 27-16-17

		// you have to pass the input here any how , because you are giving input using methods

	}
}
