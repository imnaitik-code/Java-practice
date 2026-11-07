package com.S12;
import java.util.Scanner;
public class countt {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            int count = 0;

            if (n == 0) {
                count = 1;
            } else {
                n = Math.abs(n);

                while (n > 0) {
                    n = n / 10;
                    count++;
                }
            }

            System.out.println("Total digits = " + count);

            sc.close();
        }
    }
