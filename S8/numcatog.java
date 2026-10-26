package com.S8;
import java.util.Scanner;
public class numcatog {
    public static void main(String[] args) {
        //Input a number and classify it as one-digit, two-digit or three-digit (for positive numbers up to 999).
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= 1 && a <= 9) {
            System.out.println(a + " is the single digit number");
        }
        else if (a >= 10 && a <= 99) {
            System.out.println(a + " is the two digit number");
        }
        else{
            System.out.println(a + " is the three digit number or greater");
        }
        sc.close();
    }
}
