package com.S8;
import java.util.Scanner;
public class weekday {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the day of the week 1 to 7");
        int day = input.nextInt();
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int f = 6;
        int g = 7;

        if (day==1){
            System.out.println("monday");
        }
        else if (day==2){
            System.out.println("tuesday");
        }
        else if (day==3){
            System.out.println("wednesday");
        }
        else if (day==4){
            System.out.println("thursday");
        }
        else if (day==5){
            System.out.println("friday");
        }
        else if (day==6){
            System.out.println("saturday");
        }
        else {
            System.out.println("sunday");
        }
    }

}
