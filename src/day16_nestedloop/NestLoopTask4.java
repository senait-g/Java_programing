package day16_nestedloop;

import java.util.Scanner;

public class NestLoopTask4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true){

            System.out.println("Enter the side of the square:");
            double side = input.nextDouble();

            while (!(side > 0)){

                System.out.println("Invalid Entry for the side of the squar! re-enter");
                side = input.nextDouble();
            }

            double area = side * side;
            double perimeter = 4 * side;

            System.out.println("Area of square:" + area);
            System.out.println("Perimeter of square:" + perimeter);

            System.out.println();

            System.out.println("Would you like to calculator another square? Yes/No");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))){
                System.out.println("Invalid Entry! please re-enter again.");
                answer = input.next().toLowerCase();

            }
            if(answer.equals("no")){
                System.out.println("Thank you for using cydeo squar calculator App");
                return;
            }

        }

    }
}
/*
 Write a program that can calculate the area and perimeter of a Square:
                        1. Ask the user "Enter the side of the square:"
                                if user enters 0 or negative numbers, terminate the program
                                after displaying the error message "Invalid Entry for the side of the square"

                        2. Display:
                                        1. Area of square
                                        2. Perimeter of square

                        3. Ask the user "Would you like to calculate another Square?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program
 */