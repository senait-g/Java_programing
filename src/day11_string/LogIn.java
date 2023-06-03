package day11_string;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        String  correctUserName ="Cydeo";
        String  correctPassword = "WoodenSpoon";


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username");
        String userName = input.nextLine();

        System.out.println("Enter your  password");
        String password = input.nextLine();

        input.close();


        if( userName.equals(correctUserName) && password.equals(correctPassword)){

            System.out.println("you are now logged in");

        }else{

            System.out.println("Incorrect username or password. please try again");
        }


    }
}
