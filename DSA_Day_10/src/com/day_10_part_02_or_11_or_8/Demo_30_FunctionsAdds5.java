package com.day_10_part_02_or_11_or_8;

public class Demo_30_FunctionsAdds5 {

	public static int shopping(String item1, String item2, int money) { // input of the methods
		System.out.println(item1 + ", " + item2); // method ka kam
		int costItem1 = 45;
		int costItem2 = 35;

		return money - costItem1 - costItem2;
	}

	public static void main(String[] args) {
	int money = 100;
	int res=	shopping("Brijal", "Onion", money);
System.out.println("rem money : " +res);
	}

}
