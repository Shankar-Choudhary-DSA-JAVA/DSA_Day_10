package com.day_10_part_02_or_11_or_8;

import java.util.Scanner;

public class Demo_5_Diamonds3
{
   public static void main(String[] args)
   {
	   
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the numbers : ");
		int n = sc.nextInt();
        int i, stars, space;
      
      for(i=1; i<=n; i++)
      {
         for(space=1; space<=n-i; space++) {
            System.out.print(" ");
         }
         for(stars=1; stars<=2*i-1; stars++) {
            System.out.print("*");
         }
         System.out.println();

      }

      
          
      
      for(i=0; i<n; i++)
      {
         for(space=i; space>=0; space--) {
            System.out.print(" ");
         }
         
         for(stars=(n*2)-3; stars>(i*2); stars--) {
            System.out.print("*");
         }
         
         System.out.println();
      }
   
   }
}
