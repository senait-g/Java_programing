package day15_forLoop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number:");

        double num1 = input.nextDouble();

        System.out.println("Enter your second num2:");
        double num2 = input.nextDouble();

        System.out.println("Enter a math operator:");
        char operator = input.next().charAt(0);

        while( ! (operator == '+' || operator == '-'  || operator == '*' || operator == '/' )){

            System.out.println("Invalid Operator! please re-enter the math operator");

            operator = input.next().charAt(0);
        }

       if(operator == '+'){

           System.out.println(num1 + num2);
       } else if (operator == '-') {
           System.out.println(num1 - num2);

       }else if(operator == '*'){

           System.out.println(num1 * num2);
       }else{

           System.out.println(num1 / num2);
       }


    }
}
