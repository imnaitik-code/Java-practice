package com.S6;
import java.util.Scanner;
public class divisible {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("Enter a number");
        int n = num.nextInt();
//        if (n%3==0){
//            System.out.println(n+" is divisible by 3");
//        }
//        if (n%5==0){
//            System.out.println(n+" is divisible by 5");
//        }

        if(n%3==0 && n%5==0){
            System.out.println(n+" is divisible by 3 and 5");
        }
        else{
            System.out.println(n+" is not divisible by 3 and 5");
        }

    }
}
