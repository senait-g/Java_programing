package day09_scanner;

import java.util.Scanner;

public class PlaceAnOrder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter the product name");

        String productName = input.nextLine();

        System.out.println("Enter the price ");

        double price = input.nextDouble();

        System.out.println("Enter the quantity");

        int quantity = input.nextInt();

        System.out.println("Enter their first name");

        String name = input.next();

        double total = price * quantity;

        System.out.println(name +"," +" your order for " + quantity + " " + productName + " has been places." +
                " Your total is " + total + ".");

         input.close();
    }
}
/*
 Create a class named PlaceAnOrder:
                Ask User to enter the prodcut name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.

 */