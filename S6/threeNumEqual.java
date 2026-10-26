package com.S6;
import java.util.Scanner;
public class threeNumEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1==num2 && num1==num3){
            System.out.println("Your number is Equal ");
        }
        else {
            System.out.println("Your number is not Equal ");
        }

    }
}
