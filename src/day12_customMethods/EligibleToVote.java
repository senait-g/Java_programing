package day12_customMethods;

public class EligibleToVote {

    public static void main(String[] org){

        EligibleToVote(23,true);

    }

    public static void EligibleToVote(int age, boolean isAmerican){

        if(age >= 18 && isAmerican == true){

            System.out.println(" You are eligible  to vote");
        }else {
            System.out.println("You are not eligible");
        }
    }

}
/*
 Create a method named eligibleToVote that takes two arguments:
        1. age (int)
        2. isAmerican (boolean)

    Then the method should determine if the person eligible to vote
        Ex:
            eligibleToVote(23, true)

        output:
            You are eligible to vote
 */