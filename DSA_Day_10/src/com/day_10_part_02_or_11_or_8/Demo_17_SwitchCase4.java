package com.day_10_part_02_or_11_or_8;

import java.util.Scanner;

public class Demo_17_SwitchCase4 {


	public static void main(String[] args) {

//  SwitchCase is used in place of multiple if else conditions, so that it will be simple
		//* After every case use break statements
		
		//* After every case use break statements, otherwise it will 
		//print the below case as well till it will find the next break
		
		//	* case values (1,2 etc)  takes enums, int, strings etc

		char letter ='a';
		
		switch(letter) {
		case 'a':
			System.out.println("Yes");
		}
		
		
		String name ="Shankar";
		switch(name) {
		case "Shankar" :
                System.out.println("Hello Shankar");			
		}
		}
		
}
