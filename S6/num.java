package com.S6;
import java.util.Scanner;
public class num {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        int num2 = num.nextInt();
        if(num1==num2){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Both are not equal");
        }

    }
}
