package com.day_10_part_02_or_11_or_8;

import java.util.Scanner;

public class Demo_32_FunctionsAdds6 {

	public static int shopping(String item1, String item2) { // input of the methods
		System.out.println(item1 + ", " + item2); // method ka kam
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the money please :");
		int money=sc.nextInt();
		int costItem1 = sc.nextInt();
		int costItem2 = sc.nextInt();

		return money - costItem1 - costItem2;
	}

	public static void main(String[] args) {
	int res=	shopping("Brijal", "Onion");
System.out.println("rem money : " + res);
	}

}
