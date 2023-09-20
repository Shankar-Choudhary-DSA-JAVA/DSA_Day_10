package com.day_10_part_02_or_11_or_8;

import java.util.Scanner;

public class Demo_19_SwitchCase6Calculators {

	public static void main(String[] args) {

//  SwitchCase is used in place of multiple if else conditions, so that it will be simple
		// * After every case use break statements

		// * After every case use break statements, otherwise it will
		// print the below case as well till it will find the next break

		// * case values (1,2 etc) takes enums, int, strings etc

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the Operations : ");
		String oper = sc.next();
		int a = sc.nextInt();
		int b = sc.nextInt();

		switch (oper) {

		case "Add":
			System.out.println(a + b);

			break;
		case "Subtracts":

			System.out.println(a - b);
			break;

		case "Multiply":
			System.out.println(a * b);
			break;

		case "Divide":
			System.out.println(a / b); // quotient
			break;
		case "Remainder":
			System.out.println(a % b);
			break;

		default:
			System.out.println("Enter the valid Operations names");
		}
	}
}
