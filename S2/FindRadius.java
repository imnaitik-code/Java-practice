package com.S2;
import java.util.Scanner;
public class FindRadius {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the Diameter of the circle : ");
        double d=num.nextInt();
        double r = d / 2;
        System.out.print("Enter the radius of the circle : "+ r);
        num.close();
    }
}
