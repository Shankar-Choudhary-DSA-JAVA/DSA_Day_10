package com.day_10_part_02_or_11_or_8;

import java.util.Scanner;

public class Demo_4_Diamonds2
{
   public static void main(String[] args)
   {
	   
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the numbers : ");
		int n = sc.nextInt();
      int i, stars, space;
      
      for(i=0; i<n; i++)
      {
         for(space=i; space<(n-1); space++)
            System.out.print(" ");
         for(stars=0; stars<(i*2)+1; stars++)
            System.out.print("*");
         System.out.print("\n");
      }
      for(i=0; i<n; i++)
      {
         for(space=i; space>=0; space--)
            System.out.print(" ");
         for(stars=(n*2)-3; stars>(i*2); stars--)
            System.out.print("*");
         System.out.print("\n");
      }
   }
}
