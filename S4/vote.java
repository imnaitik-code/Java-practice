package com.S4;
import java.util.Scanner;
public class vote {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the Age: ");
        int n = num.nextInt();
        if (n>=18){
            System.out.println("person is eligile to vote");
        }
        else{
            System.out.println("person is not eligile to vote");
        }


    }
}
