package com.day_10_part_01_or_6_or_7;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i=2;
        boolean divisor_found = false;


        while(i<n){
           if(n%i==0){
               divisor_found = true;
               break;
           }
           i=i+1;
        }
        if(!divisor_found) {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }

    }
}