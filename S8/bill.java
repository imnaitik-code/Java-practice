package com.S8;
import java.util.Scanner;
public class bill {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number of slab: ");
        int slab = num.nextInt();
        int bill;
        int a = 2;
        int b = 3;
        int c = 5 ;
        if (slab >= 1 && slab <= 100) {
            bill = slab*a;
            System.out.println("elctric bill "+bill);
        }
        else if (slab >= 101 && slab <= 200) {
            bill = slab * b;
            System.out.println("elctric bill " +bill);
        }
        else if (slab >= 201 && slab <= 300) {
            bill = slab * c;
            System.out.println("elctric bill " +bill);
        }
        else {
            System.out.println(slab + " not valid imput ");
        }
        num.close();
    }
}
