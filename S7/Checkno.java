package com.S7;
import java.util.Scanner;
public class Checkno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if(num>=10 && num<=99){
            System.out.println("This number is two digit number "+num);
        }
        else{
            System.out.println("This number is not two digit number "+num);
        }
    }
}
