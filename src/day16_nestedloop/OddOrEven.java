package day16_nestedloop;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true){

            System.out.println("Enter a number");
            int number = input.nextInt();

            if(number % 2 == 0){

                System.out.println( number + " Even");
            }else {

                System.out.println(number + " odd number");
            }

            System.out.println("would you like to enter another number ? Yes/No");
            String answer = input.next();


        }







    }
}
