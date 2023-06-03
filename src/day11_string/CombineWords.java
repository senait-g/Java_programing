package day11_string;

import java.util.Scanner;

public class CombineWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word:");

        String num1 =input.nextLine();

        System.out.println("Enter second word");

        String num2 = input.nextLine();
        String result = "";

        if(num1.endsWith("") == num2.endsWith("")){

           result = num1 + num2.substring(1);

        }else{

            result = "Invalid word";
        }

        System.out.println(result);


    }
}

/*
 Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same, print that character once.

                Input:
                    one
                    eight
                Output:
                    oneight
 */