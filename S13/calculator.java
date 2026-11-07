package com.S13;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        double a, b;

        do {
            System.out.println("\n===== CALCULATOR =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {

                System.out.print("Enter first number: ");
                a = sc.nextDouble();

                System.out.print("Enter second number: ");
                b = sc.nextDouble();

                switch (choice) {

                    case 1:
                        System.out.println("Result = " + (a + b));
                        break;

                    case 2:
                        System.out.println("Result = " + (a - b));
                        break;

                    case 3:
                        System.out.println("Result = " + (a * b));
                        break;

                    case 4:
                        if (b != 0) {
                            System.out.println("Result = " + (a / b));
                        } else {
                            System.out.println("Cannot divide by zero!");
                        }
                        break;
                }

            } else if (choice == 5) {
                System.out.println("Calculator exited successfully!");

            } else {
                System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}

