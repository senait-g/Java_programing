package day07;

public class AgeGroup {


    public static void main(String[] args) {




        int age = 80;

        if(age>0 && age <= 150 ){


           if( age > 50 ) {
               System.out.println("senior");

           }else if (age > 21){

               System.out.println("Adult");

           }else{

               System.out.println("Teenager");
           }


        }else{
            System.out.println("invalid");

        }


    }

}

   // Create a class called AgeGroups, write a program that can define the age groups of a person
       // age groups are:
       // Teenager (< 21)
       // Adult   (>=21 && <55 )
     //   Senior  ( > 55 )

       // if age is negative or greater than 150, print invalid

       // NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
