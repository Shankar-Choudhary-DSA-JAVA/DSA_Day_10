package com.day_10_part_02_or_11_or_8;

import java.util.Scanner;

public class Demo_15_SwitchCase2 {

	public static void main(String[] args) {

//  SwitchCase is used in place of multiple if else conditions, so that it will be simple
		//* After every case use break statements
		
		//* After every case use break statements, otherwise it will 
		//print the below case as well till it will find the next break
		
		
	//	* case values (1,2 etc)  takes enums, int, strings etc
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the case : ");
		int day = sc.nextInt();

		switch(day) {
		
		case 1: 
			System.out.println("Monday");
			break;
		case 2: 
			System.out.println("Tues");
			break;

		case 3: 
			System.out.println("TWed");
			break;

		case 4: 
			System.out.println("Thu");
			break;

		case 5: 
			System.out.println("Fri");
			break;

		case 6: 
			
		case 7: 
			System.out.println("Weekens Enjoy :)");
			break;
			
			default:
				System.out.println("Please Enter the valid day");

		}
			}
}
