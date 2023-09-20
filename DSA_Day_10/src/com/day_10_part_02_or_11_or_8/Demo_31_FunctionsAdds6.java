package com.day_10_part_02_or_11_or_8;

public class Demo_31_FunctionsAdds6 {
	//static int money = 100;


	public static int shopping(String item1, String item2) { // input of the methods
		System.out.println(item1 + ", " + item2); // method ka kam
		
		int money = 100;
		int costItem1 = 45;
		int costItem2 = 35;

		return money - costItem1 - costItem2;
	}

	public static void main(String[] args) {
	int res=	shopping("Brijal", "Onion");
     System.out.println("rem money : " +res);
	}

}
