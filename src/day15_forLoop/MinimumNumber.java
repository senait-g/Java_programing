package day15_forLoop;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int min = 2147483647;

        for(int i = 0 ; i <= 5; i++){

            System.out.println("Enter a number:");

            int num = input.nextInt();// 20,30,-5,100,200

            if(num < min){

                min = num;
            }
        }

        System.out.println("Minumum number is: " + min);

        input.close();
    }
}
