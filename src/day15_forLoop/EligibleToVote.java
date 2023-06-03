package day15_forLoop;

import java.util.Locale;
import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();

        while( ! (age >= 1 && age <= 120) ){ // while the age is not valid

            System.out.println("Invalid Entry, please re-enter your age:");
            age = input.nextInt();

        }

        System.out.println("Are you a US citizen? Yes/No ");
        String yesOrNo = input.next().toLowerCase();

        while( !(yesOrNo.equals("yes") || yesOrNo.equals("no") )){  // while the answer is neither yes nor no,

            System.out.println("Invalid Entry! please re-enter");
            System.out.println("Are you a US citizen? Yes/No");
            yesOrNo = input.next().toLowerCase();

        }

        if( age >= 21 &&yesOrNo.equals("yes")){
            System.out.println("You are eligible to vote");

        }else{

            System.out.println("You are not eligible to vote");

        }
    }
}
