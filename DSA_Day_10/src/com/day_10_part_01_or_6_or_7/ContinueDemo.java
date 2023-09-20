package com.day_10_part_01_or_6_or_7;

public class ContinueDemo {
    public static void main(String[] args) {
        int i = 2;
        while(i<=20){
            if(i==7){
                i = i + 8;
                continue;

            }
            System.out.println(i);
            i = i + 1;
        }
    }
}