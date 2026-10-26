
package com.S9;

import java.util.Scanner;

public class atmcheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int correctPIN = 1234;
        double balance = 5000;

        System.out.print("Enter your PIN: ");
        int pin = sc.nextInt();

        if (pin == correctPIN) {

            System.out.println("PIN verified successfully");

            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            if (amount > 0) {

                if (balance >= amount) {
                    balance = balance - amount;

                    System.out.println("Withdrawal successful");
                    System.out.println("Remaining balance: " + balance);
                }
                else {
                    System.out.println("Insufficient balance");
                }

            }
            else {
                System.out.println("Invalid withdrawal amount");
            }

        }
        else {
            System.out.println("Incorrect PIN");
        }

        sc.close();
    }
}
