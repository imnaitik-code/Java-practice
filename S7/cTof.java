package com.S7;
import java.util.Scanner;
public class cTof {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int c = num.nextInt();
        double F = c * 9 / 5 + 32;
        System.out.println("the temperature is " +F );
    }
}
