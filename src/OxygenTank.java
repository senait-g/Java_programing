public class OxygenTank {

    public static void main(String[] args) {

        int OxygenTank = 62;

        String result = "";

        result =(OxygenTank >= 90)?  "Your tank is full" :(OxygenTank >= 80)? "Still okay" :(OxygenTank >= 70)?
                "Don't go too far" :(OxygenTank >= 60)? "Start to head baxk" :"Be careful now you at at 50%";


        System.out.println(result);

    }

}
/*
4. Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number)
 and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY

            Solution 1: Must use ternary

 */