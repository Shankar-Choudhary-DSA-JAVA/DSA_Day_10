package com.day_10_part_02_or_11_or_8;

public class Demo_7_PostAndPreIncr {

	public static void main(String[] args) {
		
		
	// right to left evaluation by cpu	
		int e=50;
		int f=e=e+5;
		int g=e++;
		
		System.out.println(e + " , " +f);

		System.out.println(e + " , " +g);

		
		
		// left to right evaluation by cpu
		int r=10;
		r++; //11
		int s=r++; //s=11 , r= 12
		System.out.println(r+ ","+s); // r=12, s=11,
		
		
		int t=10;
		t++;
		System.out.println(t); //11
		t=t+1;
		System.out.println(t); //12
		
		

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
