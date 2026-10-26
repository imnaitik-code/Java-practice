package com.S5;
import java.util.Scanner;
public class avg {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the five number");
        int n1 = num.nextInt();
        int n2 = num.nextInt();
        int n3 = num.nextInt();
        int n4 = num.nextInt();
        int n5 = num.nextInt();
        int average = (n1+n2+n3+n4+n5) / 5;
        System.out.println(average);

    }

}
