package com.S11;
import java.util.*;
public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int multiplication=1;
        for(int a=1; a<=10; a++){
            multiplication=n*a;

            System.out.println(n + " x " + a + " = " + multiplication);
        }
    }
}
