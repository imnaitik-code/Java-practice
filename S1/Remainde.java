package com.S1;

import java.util.Scanner;

public class Remainde {
    public static void main(String[] args) {
//        int num1=10;
//        int num2=5;
//        int remainder=num1/num2;
//        System.out.println(remainder);

        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        int num2 = num.nextInt();
        int remainder = num1 % num2;
        System.out.println(remainder);
        }
}
