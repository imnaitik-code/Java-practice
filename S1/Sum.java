package com.S1;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // method 1
//        int num1 = 10;
//        int num2 = 20;
//        int sum = num1 + num2;
//        System.out.println(sum);

        // method 2

        Scanner num = new Scanner (System.in);
        int num1 = num.nextInt();
        int num2 = num.nextInt();
        int sum = num1 + num2;
        System.out.println("the sum of no is: " +sum);

    }
}
