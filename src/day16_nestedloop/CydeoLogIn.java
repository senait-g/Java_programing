package day16_nestedloop;

import java.util.Scanner;

public class CydeoLogIn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username:");
        String u = input.nextLine();

        System.out.println("Enter your password:");
        String p = input.next();

        if(u.equals("Cydeo") && p.equals("WoodenSpoon")){ // if the credential are correct
            System.out.println("Logged in");

        }else { // otherwise

            for (int i = 0; i < 3; i++) {

                System.err.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username:");
                u = input.next();

                System.out.println("Enter your password:");
                p = input.next();

                if(u.equals("Cydeo") && p.equals("WoodenSpoon")){

                    System.out.println("you are now logged in");
                    break; // exits the loop
                }

            }

            if( ! (u.equals("Cydeo") && p.equals("WoodenSpoon"))){ // after all three attemps, if the username

                System.out.println("Your account now is locked, please contact with the support team");
            }
        }
          input.close();


    }

    public static void cydeoLogIn(String username, String password){

        if(username.equals("Cydeo") && password.equals("WoodenSpoon")){

            System.out.println("Logged in");
        }else {

            System.out.println("Invalid credential ");


        }
    }
}
