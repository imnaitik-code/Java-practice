package com.S2;
import java.util.Scanner;
public class AreaofRect {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the length");
        int length = num.nextInt();
        System.out.println("Enter the breadth");
        int breadth = num.nextInt();
        int Area = 2*length*breadth;
        System.out.println("Area of reactange is" +Area);
        num.close();
    }

}
