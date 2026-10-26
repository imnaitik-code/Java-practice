package com.S7;
import java.util.Scanner;
public class intToDouble {
    public static void main(String[] args) {
//        int a=10;
//        double b=a*2;
//        System.out.println(b);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        double result = (double) num;

        System.out.println("Integer value: " + num);
        System.out.println("Double value: " + result);

        sc.close();

    }

}
