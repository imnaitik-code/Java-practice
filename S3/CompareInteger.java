package com.S3;
import java.util.Scanner;
public class CompareInteger {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        int num1=num.nextInt();
        int num2=num.nextInt();

//        System.out.println("num1 is greater than num2 is "+ (num1>num2));
//        System.out.println("num1 is greater than num1 is "+ (num1<num2));

//        if(num1>num2){
//            System.out.println("Number 1 is greater");
//        }
//        else if(num1<num2){
//            System.out.println("Number 2 is greater");
//        }
//        else{
//            System.out.println("Bote are equal");
//        }

        switch (Integer.compare(num1, num2)) {
            case 1:
                System.out.println(num1 + " is greater");
                break;

            case -1:
                System.out.println(num2 + " is greater");
                break;

            default:
                System.out.println("Both are equal");
        }

        num.close();
    }
}
