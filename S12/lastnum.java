package com.S12;
//find last of number using while loop
import java.util.Scanner;
public class lastnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int n = sc.nextInt();
        int digit = 0;
        while(n>0){
           digit = n%10;
           break;

        }
        System.out.print(digit);
    }
}
