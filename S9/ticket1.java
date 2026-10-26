
package com.S9;

import java.util.Scanner;

public class ticket1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter ticket price: ");
        double price = sc.nextDouble();

        if (age >= 0 && price >= 0) {

            if (age < 12) {
                double ticketPrice = price / 2;
                System.out.println("Child discount applied");
                System.out.println("Final price: " + ticketPrice);
            }
            else {
                if (age >= 60) {
                    double ticketPrice = price / 2;
                    System.out.println("Senior discount applied");
                    System.out.println("Final price: " + ticketPrice);
                }
                else {
                    System.out.println("No discount applied");
                    System.out.println("Final price: " + price);
                }
            }

        }
        else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}
