package com.S11;
import java.util.*;
public class sumOfNeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int a=1; a<=n; a++){
            if(a%2==0){
                sum=sum+a;
            }
        }
        System.out.println(sum);
    }
}
