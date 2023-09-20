package com.day_10_part_02_or_11_or_8;

public class Demo_6_InteToCharTypeCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n= 65;
		char letter = 'T';

		// after every row the value of letter should get increment

		char letter1 = (char) n; // it will convert int to char

		letter = (char) (letter + 1);
		System.out.println(letter);
System.out.println(letter1);
	}

}
