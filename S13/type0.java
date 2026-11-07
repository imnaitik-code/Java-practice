package com.S13;
import java.util.Scanner;
public class type0 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter a number (0 to stop): ");
            n = sc.nextInt();
        } while (n != 0);
        System.out.println("You entered 0. Program stopped.");
        sc.close();
    }
}

