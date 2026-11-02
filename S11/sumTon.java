package com.S11;
import java.util.Scanner;
public class sumTon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int a=1; a<=n; a++){
            sum = sum+a;
        }
        System.out.println(sum);
    }
}
