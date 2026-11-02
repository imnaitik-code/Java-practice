package com.S11;
import java.util.*;
public class n_sq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumofsq=0;
        for (int i = 1; i <= n; i++){
            sumofsq=sumofsq+(i*i);
        }
            System.out.println(sumofsq);
    }
}
