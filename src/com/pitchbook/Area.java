package com.pitchbook;

import java.util.Scanner;

public class Area {
    public static void areaOfSquare (int side) {
        System.out.println("The area of the square is: " + side * side);
    }

    public static void areaOfCircle (int side) {
        System.out.println("The area of the circle is:" + side * side * Math.PI);
    }

    public static void areaOfTriangle (int side) {
        System.out.println("The area of the triangle is: " + (Math.sqrt(3) / 4) * side * side);
    }

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            areaOfSquare(number);
        }
        else if (number % 3 == 0) {
            areaOfCircle(number);
        }
        else {
            areaOfTriangle(number);
        }
    }
}
