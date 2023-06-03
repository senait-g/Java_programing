package day16_nestedloop;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer = "yes";

        while(answer.equals("yes")){
            System.out.println("Enter your first number:");

            double num1 = input.nextDouble();

            System.out.println("Enter the math operator");

            char operator = input.next().charAt(0);

            while( !(operator == '+' || operator == '-' || operator == '*' || operator == '/')){

                System.err.println("Invalid operator! please re-enter the math operator");
                operator= input.next().charAt(0);
            }

            System.out.println("Enter your second");
            double num2 = input.nextDouble();

            double result = (0 == '+')? num1 + num2 :(0 == '-')? num1 - num2 :(0 =='*')? num1 * num2 : num1 / num2;

            System.out.println("result = " + result);

            System.out.println("Would you like to continue? Yes/no");
            answer = input.next().toLowerCase();
        }
       while(! (answer.equals("yes") || answer.equals("no"))){

           System.out.println("Invalid Answer! Would you like to continue? Yes/no");
           answer = input.next().toLowerCase();
       }

    }
}
