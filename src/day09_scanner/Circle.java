package day09_scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");

        double radius = input.nextDouble();

        double area = 3.14159*radius*radius;
        double perimeter = 2 * 3.14159 * radius;

        System.out.println("Are of the circle is:" + area);
        System.out.println("perimeter of the circle is: " + perimeter);

input.close();
    }


    }

/*
 Create a class named Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
 */

