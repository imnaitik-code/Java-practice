package com.S12;
import java.util.*;
public class countpno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = 0;
        int count = 0;
        while (n>0){
            digit = n%10;
            if(n%2==0) {
                count=count+1;
            }
            n=n/10;

        }
        System.out.print(count);
    }
}
