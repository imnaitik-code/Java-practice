package com.S5;
import java.util.Scanner;
public class sq {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter number");
        int n = num.nextInt();
        int square = n * n;
        int cube = n * n * n;
        System.out.println(square);
        System.out.println(cube);
        num.close();

    }

}
