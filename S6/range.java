package com.S6;
import java.util.Scanner;
public class range {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=num.nextInt();
        if(n>=1 && n<=100){
            System.out.println(n+" is inside range");
        }
        else{
            System.out.println(n+" is outside range");
        }

    }

}
