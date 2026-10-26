package com.S1;

import java.util.Scanner;

public class differ {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        int num2 = num.nextInt();
        int diff = num1 - num2;
        System.out.println("the difference is: " + diff);

    }
}
