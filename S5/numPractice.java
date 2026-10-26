package com.S5;
import java.util.Scanner;
public class numPractice {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = num.nextInt();
        System.out.print("Enter a number: ");
        int num2 = num.nextInt();
        int sum = num1 + num2;
        int rest = num2 - num1;
        int multiply = num1 * num2;
        int divide = num1 / num2;
        int remainder = num2 % num1;
        System.out.println("The sum is: " + sum);
        System.out.println("The rest is: " + rest);
        System.out.println("The multiply is: " + multiply);
        System.out.println("The divide is: " + divide);
        System.out.println("The remainder is: " + remainder);
        num.close();
    }
}
