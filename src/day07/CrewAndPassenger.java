package day07;

public class CrewAndPassenger {
    public static void main(String[] args) {

        int number = 100;
        String result = "";

        if(number==50 || number == 75 || number == 100) {

            if (number == 50) {
                result = "50 ======>20 crew,30 passengers";
            } else if (number == 75) {

                result = "75 =====> 25 crew, 50 passengers";

            } else {
                result = " 100 ====>30 crew, 70 passengers";

            }
        }else {
            result = number +" number of people is not valid";{

            }

            System.out.println(result);



            }
        }


    }


/*
Create a class called CrewAndPassenger, Given a number of people on the ship (int number), determine how many need to be crew members and how many can be passengers. Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */