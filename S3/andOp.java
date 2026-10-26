package com.S3;
import java.util.Scanner;
public class andOp {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        boolean result = (num>=1 && num<=100);

        boolean result1 = (num>=1 || num<=100);

        boolean result2 = (num>=1 != num<=100);

        System.out.println("is the no is in w/n 0 to 100" +result);
        System.out.println("is the no is in w/n 0 to 100" +result1);
        System.out.println("is the no is in w/n 0 to 100" +result2);
    }
}
