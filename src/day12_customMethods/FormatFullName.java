package day12_customMethods;

import java.util.Scanner;

public class FormatFullName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter ypur first name");

        String first = input.next();

        System.out.println("Enter your last name");

        String last = input.next();
input.close();


        String first1 = "cyDEo";
        String last2 = "sCHOOL";

        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
                // getting first character of first name

        last = last.substring(0 ,1).toUpperCase() + last.substring(1).toLowerCase();

        System.out.println(first);
        System.out.println(last);

         String full_name = first + " " + last;

        System.out.println(full_name);
    }

}
