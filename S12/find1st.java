package com.S12;
//find first digit from positive integer
import java.util.Scanner;
public class find1st {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>=10){
//            n=n%10;
//            System.out.print(n);
            n=n/10;

        }
        System.out.println(n);

    }
}
