package com.day_10_part_02_or_11_or_8;

public class Demo_8_PostAndPreIncr2 {

	public static void main(String[] args) {

		int x=10;
		int y=x++; // x++ => x=x+1 or ++x => x=X+1
		
		// it says first y=x then in seconds x=x+1
		
		System.out.println(y); // 10

		System.out.println(x); //11
		
		
		
		
		int p = 67;
		int q= ++p;
		System.out.println(q); //68
		System.out.println(p); //68
	
		
		int a = 67;
		int b= a--;
		System.out.println(a); //66
		System.out.println(b); //67
		
		int i = 67;
		int j= --i;
		System.out.println(i); //66
		System.out.println(j); //66
	
	}

}
