package com.S3;
import java.util.Scanner;
public class numDemo {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();
        int result = (a+b)*c-a;
        System.out.println(result);
    }

}
