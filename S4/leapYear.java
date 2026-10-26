
package com.S4;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = num.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year");
                } else {
                    System.out.println(year + " is not a leap year");
                }
            } else {
                System.out.println(year + " is a leap year");
            }
        } else {
            System.out.println(year + " is not a leap year");
        }

        num.close();
    }
}
