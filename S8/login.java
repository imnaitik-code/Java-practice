
package com.S8;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Predefined username and PIN
        String correctUsername = "admin";
        int correctPIN = 1234;

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        if (username.equals(correctUsername)) {

            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();

            if (pin == correctPIN) {
                System.out.println("Login successful");
            } else {
                System.out.println("Incorrect PIN");
            }

        } else {
            System.out.println("Incorrect username");
        }

        sc.close();
    }
}
