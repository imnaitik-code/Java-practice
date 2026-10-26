package com.S8;
import java.util.Scanner;
public class age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>=18){
            if (n<=60){
                System.out.println("you are in between 18 and 60");
            }
            else{
                System.out.println("you are in between 60+");
            }
        }
        else{
            System.out.println("invalid number");
        }
    }
}
