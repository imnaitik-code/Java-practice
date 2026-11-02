package com.S11;
import java.util.Scanner;
public class n_cu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumofcu = 0;
        for (int i = 1; i <= n; i++){
            sumofcu = sumofcu + (i*i*i);
        }
        System.out.println(sumofcu);
    }
}
