package com.S2;
import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the marks of English: ");
        int English = num.nextInt();
        System.out.println("Enter the marks of Science: ");
        int Science = num.nextInt();
        System.out.println("Enter the marks of Computer: ");
        int omputer = num.nextInt();
        int total = English + Science + omputer;
        int average = total / 3;
        System.out.println("Total Marls is: " + total);
        System.out.println("Average Marks is: " + average);
        num.close();
    }
}

