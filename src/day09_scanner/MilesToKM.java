package day09_scanner;

import java.util.Scanner;

public class MilesToKM {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Convert Miles to Km");

        double miles = input.nextDouble();

        double kilometer = miles * 1.609;

        System.out.println(miles +" miles equal to " + kilometer +" kilometer");

        input.close();




    }
}
/*
    Create a class named MilesToKM, write a program that can convert Miles to KM
        Ex:
        Enter miles:
        10.0

        output:
        10.0 miles equal to 16.09 kilometers
*/