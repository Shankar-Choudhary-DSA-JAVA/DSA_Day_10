package com.day_10_part_02_or_11_or_8;

import java.util.Scanner;

public class Demo_13_TernaryOperators4 {

	public static void main(String[] args) {

//# Ternary operators :-
		// used for simple if else , like comparisions
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the numbers : ");
		int n = sc.nextInt();
//		int a = 78;
//		int b = 67;

		for (int i = 0; i <= n; i++) {

			System.out.println(i % 2 == 0 ? "even :- " + i : "odd :- " + i);

		}
		
		
		
		// we can use any no. of variables for the ternary oper. using && || conditions
		//but in output it will take only two values and will show only true and false

	}
}
