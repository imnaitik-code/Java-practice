package com.S5;
import java.util.Scanner;
public class hour {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter minutes: ");
        int min = num.nextInt();
        int hour = min/60;
        min %= 60;
        System.out.println(hour+" hour and "+min +" minutes");
    }
}
