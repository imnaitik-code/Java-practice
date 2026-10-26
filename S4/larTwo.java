package com.S4;
import java.util.Scanner;
public class larTwo {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter number");
        int n = num.nextInt();
        int n1 =num.nextInt();
        if (n>n1){
            System.out.println("greater no is " +n );
        }
        else{
            System.out.println("greater no is " +n1);
        }
    }
}
