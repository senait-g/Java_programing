package day15_forLoop;

import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for five time");
        int positive = 0;
        int negative = 0;

        for (int i = 0; i <= 5; i++) {

            int number = input.nextInt();
            if (number < 0) {
                System.out.println("negative");
            } else {
                System.out.println("positive");
            }

        }
    }
}


/*
 Create a class named PositiveNegative and write a program that asks user to enter number for 5 times, and
 print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative


 */