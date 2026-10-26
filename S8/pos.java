package com.S8;
import java.util.Scanner;
public class pos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        if(num>=0){
            System.out.println("number is positive");
            if(num % 2 == 0){
                System.out.println(" And number is also even");
            }
            else{
                System.out.println("And number is Also odd");
            }

        }else {
            System.out.println("number is negative");
        }
    }
}
