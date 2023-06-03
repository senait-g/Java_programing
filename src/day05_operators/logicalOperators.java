package day05_operators;

public class logicalOperators {

    public static void main(String[] args) {



        double salary = 60000;
        int creditScore = 650;
        int age = 42;


        boolean eligibleForLoan = salary >= 30000 && creditScore >= 650 && age >= 18;

               //                      true               true              true

        System.out.println(eligibleForLoan);

        System.out.println("---------------------------------------------");


        age = 18;
        String country = "USA";

        boolean eligibleToVote = age >= 18 && country == "USA";

        System.out.println(eligibleToVote);


        System.out.println("---------------------------------------------");

        String answer = "maybe";

        boolean validAnswer = answer == "yes" || answer == "no";


        System.out.println(validAnswer);


        System.out.println("------------------------------------------");

        char grade = 'B';

        boolean passedTheExam = grade == 'A' || grade =='B' || grade == 'C' || grade == 'D';


        System.out.println(passedTheExam);

        System.out.println("---------------------------------------");

        System.out.println(true);

        System.out.println(!true);














    }











}
