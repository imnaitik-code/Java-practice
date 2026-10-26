package com.S3;
import java.util.Scanner;
public class booleanRes {
    public static void main (String[] args) {
        Scanner num = new Scanner (System.in);
        System.out.println("Enter a number between 1 and 100");
        int num1 = num.nextInt();
        System.out.println("Enter a number between 1 and 100");
        int num2 = num.nextInt();
        boolean result = num1 != num2;
        System.out.println("are no's different "+result);
        num.close();
    }
}
