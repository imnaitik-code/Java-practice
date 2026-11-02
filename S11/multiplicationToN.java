package com.S11;
import java.util.Scanner;
public class multiplicationToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter multiplication time");
        int m = sc.nextInt();
        int multiply =1;
        for (int i = 1; i <= m; i++) {
            multiply=n*i;
            System.out.println(multiply);
        }
        sc.close();
    }
}
