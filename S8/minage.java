
package com.S8;

import java.util.Scanner;

public class minage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age:");
        int age = sc.nextInt();

        if (age >= 0) {
            if (age < 18) {
                System.out.println("You are a child");
            }
            else if (age < 60) {
                System.out.println("You are 18+");
            }
            else {
                System.out.println("You are 60+");
            }
        }
        else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}
