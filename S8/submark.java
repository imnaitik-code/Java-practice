package com.S8;
import java.util.Scanner;
public class submark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks in subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks in subject 3: ");
        int m3 = sc.nextInt();

        if (m1 >=33 && m2>=33 && m3>=33){
            double average = ((m1+m2)+m3)/3.0;

            if (average >= 40 ){
                System.out.println("pass");
                System.out.println("Average is "+average);
            }
            else{
                System.out.println("fail, average is below 40");
            }
        }
        else{
            System.out.println("fail, marks is below 33");
        }
    }
}
