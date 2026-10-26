package com.S3;
import java.util.Scanner;
public class PersonAge {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("enter your age");
        int age = num.nextInt();
        if (age >= 18){
            System.out.println("you are an adult");
        }
        else{
            System.out.println("you are not an adult person");
        }
        num.close();
    }
}
