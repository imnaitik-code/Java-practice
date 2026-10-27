package com.S10;

import java.util.Scanner;

public class vowelCheck {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str = sc.nextLine();
        switch (str) {
            case "a":
                System.out.print("Vowe A: ");
                break;

            case "e":
                System.out.print("Vowe E: ");
                break;

            case "i":
                System.out.print("Vowe I: ");
                break;

            case "o":
                System.out.print("Vowe O: ");
                break;

            case "u":
                System.out.print("Vowe U: ");
                break;

            default:
                System.out.println("not vowel");
                break;
        }

    }
}
