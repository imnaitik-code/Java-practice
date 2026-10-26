package com.S3;
import java.util.Scanner;
public class notEqual {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        int num2 = num.nextInt();
        if(num1 != num2){
            System.out.println(num1 + " is not equal to " + num2);
        }
        else{
            System.out.println(num1 + " is equal to " + num2);
        }
    }
}
