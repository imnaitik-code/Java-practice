package com.S6;
import java.util.Scanner;
public class numcheck {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = num.nextInt();
        System.out.println("Enter a number");
        int m = num.nextInt();

        if(m==n){
            System.out.println("both are equal");
        }
        else if(n>m){
            System.out.println(n+ " is greater");
        }
        else{
            System.out.println(m+ " is greater");
        }

    }

}
