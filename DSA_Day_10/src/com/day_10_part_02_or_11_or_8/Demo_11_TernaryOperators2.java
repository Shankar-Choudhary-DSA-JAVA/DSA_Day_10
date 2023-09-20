package com.day_10_part_02_or_11_or_8;

import java.util.Scanner;

public class Demo_11_TernaryOperators2 {

	public static void main(String[] args) {

//# Ternary operators :-
		// used for simple if else , like comparisions
		// Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the numbers : ");
		// int n = sc.nextInt();
		int a = 4;
		int b = 5;
		int money = 100;
//		for (int i = 0; i <= n; i++) {
//
//			System.out.println(i % 2 == 0 ? "even -> " + i : "odd ->  " + i);
//
//		}

		// we want to run this loop for the min of these two numbers

		for (int i = 0; i <= (a > b && money > 100 ? b : a); i++) {
			
			// this loop will run a or b times, according to the conditions

			System.out.println(i % 2 == 0 ? "even :- " + i : "odd :- " + i);

		}

	}
}
