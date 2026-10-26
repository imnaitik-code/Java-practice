package com.S6;
import java.util.Scanner;
public class grtTwenty {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=num.nextInt();
        if (n>=20 && n%2==0){
            System.out.println(n+" is in range and divisible");
        }
        else{
            System.out.println(n+" is not ");
        }

    }

}
