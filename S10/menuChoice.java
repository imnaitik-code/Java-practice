package com.S10;

import java.util.Scanner;

public class menuChoice {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Food Menu");
        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. Dosa");
        System.out.println("4. Biryani");

        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected Pizza");
                break;

            case 2:
                System.out.println("You selected Burger");
                break;

            case 3:
                System.out.println("You selected Dosa");
                break;

            case 4:
                System.out.println("You selected Biryani");
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
