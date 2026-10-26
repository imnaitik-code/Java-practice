package com.S2;
import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the Diameter of circle : ");
        double d=num.nextInt();
        double r= d / 2;
        System.out.print("Enter the radius of the circle : " +r);
        double Area = 3.14*r*r;
        System.out.println("Area of reactange is" +Area);
        double perimeter = 2*r*r;
        System.out.print("perimeter of reactange is : " +perimeter);
        num.close();

    }

}
