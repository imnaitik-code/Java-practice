
package com.S9;

import java.util.Scanner;

public class lengthOfTrinagle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three side lengths:");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if (side1 > 0 && side2 > 0 && side3 > 0) {

            if (side1 + side2 > side3 &&
                    side1 + side3 > side2 &&
                    side2 + side3 > side1) {

                System.out.println("Triangle can be formed");

            } else {
                System.out.println("Triangle cannot be formed");
            }

        } else {
            System.out.println("Invalid input: Sides must be positive");
        }

        sc.close();
    }
}
