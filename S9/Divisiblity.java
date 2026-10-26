package com.S9;
import java.util.Scanner;
public class Divisiblity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>0){
            if(num%2==0 && num%3==0){
                System.out.println(num+" is divisible by 2&3");
            }
            else {
                System.out.println(num+" is not divisible by both");
            }
        }
        else{
            System.out.println(num+" number is not positive");
        }
        sc.close();

    }

}
