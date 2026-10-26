package com.S6;
import java.util.Scanner;
public class validage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if (age>=18 && age<=60){
            System.out.println("Your age is valid ");
        }
        else{
            System.out.println("Your age is invalid ");
        }
    }
}
