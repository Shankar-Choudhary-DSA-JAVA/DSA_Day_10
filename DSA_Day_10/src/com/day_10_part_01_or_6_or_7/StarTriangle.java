package com.day_10_part_01_or_6_or_7;

public class StarTriangle {
    public static void main(String[] args) {

        int n = 5;
        // Print N Rows
        for(int i=1; i<=n; i=i+1){
            // N-i spaces
            for(int spaces=1; spaces<=n-i; spaces++){
                System.out.print(" ");
            }
            // 2i - 1 stars
            for(int stars=1; stars<=2*i - 1; stars++){
                System.out.print("*");
            }
            // new line
            System.out.println();
        }
    }
}