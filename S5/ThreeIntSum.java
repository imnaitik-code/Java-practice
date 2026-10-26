package com.S5;
import java.util.Scanner;
public class ThreeIntSum {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        int num2 = num.nextInt();
        int num3 = num.nextInt();
        int sum = num1 + num2 + num3;
        System.out.println(sum);
        num.close();
    }

}
