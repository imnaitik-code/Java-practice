
package com.S8;

import java.util.Scanner;

public class Scoreclassify {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0 || n > 100) {
            System.out.println("Invalid input");
        }
        else if (n <= 39) {
            System.out.println("Need improvement");
        }
        else if (n <= 69) {
            System.out.println("Average");
        }
        else if (n <= 89) {
            System.out.println("Good");
        }
        else {
            System.out.println("Excellent");
        }

        sc.close();
    }
}
