package com.S4;
import java.util.Scanner;
public class NumsType {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("enter a number");
        int n = num.nextInt();
        if(n==0){
            System.out.println("Number is zero");
        }
        else if (n>=1){
            System.out.println("Number is a positive number");
        }
        else{
            System.out.println("Number is a negative number");
        }
    }
}
