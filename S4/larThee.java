package com.S4;
import java.util.Scanner;
public class larThee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("greater no is" +a);
        }
        else if(b>a && b>c){
            System.out.println("greater no is" +b);
        }
        else {
            System.out.println("greater no is" +c);
        }
    }
}
