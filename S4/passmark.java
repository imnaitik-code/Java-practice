package com.S4;
import java.util.Scanner;
public class passmark {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int marks = num.nextInt();
        if (marks>=33){
            System.out.println("You are passed");
        }
        else{
            System.out.println("You are not passed");
        }
    }
}
