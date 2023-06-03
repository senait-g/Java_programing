package day15_forLoop;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        int dividend = 100;
        int divisor = 5;
        int quotient = 0;

        while(dividend >= divisor){

            dividend -= divisor;
            quotient ++;
        }

        System.out.println("quotient = " + quotient);
    }

}
/*
Create a class named DivideTwoNumbers and Write a program that can divide two positive numbers without
using / (division) and * (multiplication) operators.
 */