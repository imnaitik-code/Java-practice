package com.S10;

import java.util.Scanner;

public class ATM {


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 1000;
        int choice;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ₹");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance = balance + deposit;
                        System.out.println("Deposit successful!");
                        System.out.println("Updated balance: ₹" + balance);
                    } else {
                        System.out.println("Invalid deposit amount");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= 0) {
                        System.out.println("Invalid withdrawal amount");
                    } else if (withdraw <= balance) {
                        balance = balance - withdraw;
                        System.out.println("Withdrawal successful!");
                        System.out.println("Remaining balance: ₹" + balance);
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using our ATM!");
                    break;

                default:
                    System.out.println("Invalid choice! Select 1-4.");
            }

        } while (choice != 4);

        sc.close();
    }
}
