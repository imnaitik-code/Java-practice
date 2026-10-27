package com.S10;

import java.util.Scanner;

public class trafficIndication {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter traffic light colour: ");
        String colour = sc.next().toLowerCase();

        switch (colour) {
            case "red":
                System.out.println("Stop");
                break;

            case "yellow":
                System.out.println("Get Ready");
                break;

            case "green":
                System.out.println("Go");
                break;

            default:
                System.out.println("Invalid colour");
        }

        sc.close();
    }
}

