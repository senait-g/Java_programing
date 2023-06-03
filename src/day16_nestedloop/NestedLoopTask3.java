package day16_nestedloop;

import java.util.Scanner;

public class NestedLoopTask3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radiusOfCircle = input.nextDouble();

        boolean calculator = true;

        while(calculator){

            if(radiusOfCircle <= 0){

                System.out.println("Invalid Entry for the radius of the circle");

            }

            double diameter = 2 * radiusOfCircle;
            double area = 3.14 * radiusOfCircle * radiusOfCircle;
            double perimeter = 2 * 3.14 * radiusOfCircle;

            System.out.println("Diameter of circle " + diameter);
            System.out.println("Area of circle " + area);
            System.out.println("Perimeter of circle " + perimeter);

            System.out.println("Would you like to calculate another circle?" );
            String answer = input.next();

            while(! (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
                System.out.println("Invalid entry. pleas re-enter yes/No");
                answer = input.next();
            }
            if(answer.equalsIgnoreCase("no")){
                calculator = false;
                System.out.println("Thank you for using Cydeo circle calculator App");
            }
        }

    }
}
/*
Write a program that can calculate the area and perimeter of a circle:
                        1. Ask the user "Enter the radius of the circle:"
                                if user enters 0 or negative numbers, terminate the program after displaying
                                the error message "Invalid Entry for the radius of the circle"

                        2. Display:
                                        1. Diameter of circle
                                        2. Area of circle
                                        3. Perimeter of circle

                        3. Ask the user "Would you like to calculate another circle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program

 */