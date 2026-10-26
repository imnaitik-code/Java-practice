
package com.S6;

import java.util.Scanner;

public class oddn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 2 != 0 || n < 0) {
            System.out.println(n + " is odd or negative");
        } else {
            System.out.println(n + " is neither odd nor negative");
        }

        sc.close();
    }
}
