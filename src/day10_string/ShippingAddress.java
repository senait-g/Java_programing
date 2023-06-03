package day10_string;

 import java.util.Scanner;
public class ShippingAddress {

 public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

      System.out.println("Enter your full name");

      String full_name = input.nextLine();

      System.out.println("Enter your building number");

      String buildingNumber = input.next();
     input.nextLine();
  System.out.println("Enter your street name: ");

      String streetName = input.nextLine();

     System.out.println("enter your city name:");
     String cityName = input.nextLine();

     System.out.println("Enter your state name: ");
     String stateName =input.nextLine();

     System.out.println("Enter your zip code:");
     String zipCode = input.nextLine();


input.close();

     System.out.println("fullName = " + full_name);
     System.out.println("buildingNumber = " + buildingNumber);
     System.out.println("streetName = " + streetName);
     System.out.println("cityName = " + cityName);
     System.out.println("zipCode =" + zipCode);


     //-------------------------------------------------------------------


     System.out.println("Your shipping address is:");
     System.out.println("\t" + full_name);
     System.out.println("\t" + buildingNumber + " " + streetName);
     System.out.println("\t" + cityName + ", " +  stateName + " " + zipCode);



     input.close();

 }



}
