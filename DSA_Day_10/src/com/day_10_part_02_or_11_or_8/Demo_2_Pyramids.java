package com.day_10_part_02_or_11_or_8;

import java.util.Scanner;

public class Demo_2_Pyramids {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the numbers : ");
		int n = sc.nextInt();
		int i;
		
		for(i=1; i<=n; i=i+1) {
			for(int spaces=1; spaces<=n-i; spaces=spaces+1) {
				System.out.print(" ");
			}
			for(int stars=1; stars<=2*i-1; stars=stars+1) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
