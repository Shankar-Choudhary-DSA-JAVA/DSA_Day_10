package com.day_10_part_02_or_11_or_8;

import java.util.Scanner;

class Add5 {

	public void add2(int p, int q) {
		System.out.println(p - q);

	}
}

public class Demo_28_FunctionsAdds4 {

	public void add2(int p, int q) {
		System.out.println(p - q);

	}

	public static void add3(int x, int y) {
		System.out.println(x * y);
	}

	public static void add(int a, int b) {

		System.out.println(a + b);

	}

	public static int add1(int a, int b) {

		return a + b;

	}

	public static void main(String[] args) {

		add3(8, 9);

		System.out.println(add1(7, 8));

		Add5 a = new Add5();
		a.add2(17, 10);

	}
}
