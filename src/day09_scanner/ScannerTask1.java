package day09_scanner;

import java.util.Scanner;

public class ScannerTask1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" how many people do you live with?");

        int numberOfPeople= input.nextInt();

        if(numberOfPeople < 3){

            System.out.println("Live with less than 3 people");

        }else if(numberOfPeople >= 3 && numberOfPeople <= 6){

            System.out.println("Live with 3 - 6 people");


        }else{

            System.out.println("Live with more than 6 people");

            input.close();
        }





    }
}
/*
Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"

 */