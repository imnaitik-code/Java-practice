package com.S4;

import java.util.Scanner;

public class EveOdd {
        public static void main(String[] args) {
            Scanner num = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = num.nextInt();
            if (n % 2 == 0) {
                System.out.println("it is a even number");
            } else {
                System.out.println("it is a odd number");


            }
        }}
