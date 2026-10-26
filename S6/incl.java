package com.S6;
import java.util.Scanner;
public class incl {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = num.nextInt();
        if(n>=10 && n<=50){
            System.out.println(n+" is inclusive");
        }
        else{
            System.out.println(n+" is not inclusive");
        }
    }

}
