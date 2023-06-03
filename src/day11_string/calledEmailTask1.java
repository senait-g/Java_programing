package day11_string;

public class calledEmailTask1 {

    public static void main(String[] args) {

        String email = "mike_tyson@gmail.com";
       String email1 = email.replaceFirst("tyson" ,"mike").replaceFirst("mike","tyson");
        System.out.println(email1);


    }
}
/*
 Create a class calledEmailTask1.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

    Write a program that can swap first name with last name in the email (Separated by an underscore).
    If the email doesn't contain an underscore print the given input email.

        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com
 */