package com.S5;
import java.util.Scanner;
public class divis {
    public static void main (String[] args) {
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        int num2 = num.nextInt();
        int divide = num2 / num1;
        int remainder = num2 % num1;

        float div = num2 / num1;
        float remainder2 = num2 % num1;

        System.out.println(divide);
        System.out.println(remainder);

        System.out.println(div);
        System.out.println(remainder2);
        num.close();
    }
}
