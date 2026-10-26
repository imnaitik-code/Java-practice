package com.S5;
import java.util.Scanner;
public class Findlast
{
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = num.nextInt();
        int remainder = n % 10;
        System.out.println(remainder);


    }
}
