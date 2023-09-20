package com.day_10_part_02_or_11_or_8;

import java.util.Scanner;

public class Demo_14_SwitchCase {

	public static void main(String[] args) {

//  SwitchCase is used in place of multiple if else conditions, so that it will be simple
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the numbers : ");
		int day = sc.nextInt();

		if (day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesday");

		} else if (day == 3) {
			System.out.println("Wed");

		} else if (day == 4) {
			System.out.println("Thu");

		} else if (day == 5) {
			System.out.println("FRi");

		} else if (day == 6) {
			System.out.println("Sat");

		} else if (day == 7) {
			System.out.println("Sunday");

		}
	}
}
