package com.S2;
import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner Num = new Scanner(System.in);
        System.out.print("Enter the side of the square : ");
        int side = Num.nextInt();
        int area = side * side;
        int perimeter = 4*side;
        System.out.println("Area of square is " +area);
        System.out.println("Square perimeter is " +perimeter);
        Num.close();
    }
}
