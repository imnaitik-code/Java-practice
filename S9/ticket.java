
package com.S9;

import java.util.Scanner;

public class ticket {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter ticket price: ");
        double price = sc.nextDouble();

        double ticketPrice;

        if (age < 0 || price < 0) {
            System.out.println("Invalid input");
        }
        else if (age < 12) {
            ticketPrice = price * 0.5;
            System.out.println("Child discount applied");
            System.out.println("Final ticket price: " + ticketPrice);
        }
        else if (age >= 60) {
            ticketPrice = price * 0.5;
            System.out.println("Senior discount applied");
            System.out.println("Final ticket price: " + ticketPrice);
        }
        else {
            System.out.println("No discount applied");
            System.out.println("Final ticket price: " + price);
        }

        sc.close();
    }
}