package com.S8;
import java.util.Scanner;
public class month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jan = 1;
        int feb = 2;
        int mar = 3;
        int apr = 4;
        int may = 5;
        int jun = 6;
        int jul = 7;
        int aug = 8;
        int sep = 9;
        int oct = 10;
        int nov = 11;
        int dec = 12;
        int num = sc.nextInt();
        if (num<=4 ) {
            System.out.println("winter");
        }
        else if(num<=5 && num<=8 ) {
            System.out.println("spring");
        }
        else if(num<=9 && num<=12 ) {
            System.out.println("summer");
        }
        else {
            System.out.println("invalid input");
        }
    }
}
