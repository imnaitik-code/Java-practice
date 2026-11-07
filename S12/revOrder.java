package com.S12;
//we have to print no in reverse order
import java.util.Scanner;
public class revOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int digit = n%10;
            System.out.print(digit);
            n=n/10;
        }
        sc.close();
    }
}
