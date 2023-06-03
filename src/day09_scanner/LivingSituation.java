package day09_scanner;

import java.util.Scanner;

public class LivingSituation {

    public static void main(String[] args) {

   Scanner input = new Scanner(System.in);

        System.out.println("how many people do you live with");
        int numberOfPeople = input.nextInt();

        if(numberOfPeople < 3){

            System.out.println("live with less than 3 people");

        }else if(numberOfPeople >= 3 && numberOfPeople <= 6){

            System.out.println("live with 3- 6 people" );

        }else{

            System.out.println("live with more than 6 people");


        }



    }

}

