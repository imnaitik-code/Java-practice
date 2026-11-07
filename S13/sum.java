package com.S13;
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        do {
            System.out.print("Enter a number: ");
            n = sc.nextInt();
            if (n >= 0) {
                sum = sum + n;
            }
        } while (n >= 0);
        System.out.println("Sum = " + sum);
        sc.close();
    }
}
