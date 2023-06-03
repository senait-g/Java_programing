package day07;

public class CappuccinoBuyer {

    public static void main(String[] args){


        String size = "abc";

        if(size== "tall"){
            System.out.println("price is $3.69");
            System.out.println("90 calories");
        } else if (size=="grande"){
            System.out.println("price is $3.69");
            System.out.println("120 calories");

        }else if(size=="venti"){

            System.out.println("price is $4.29");
            System.out.println("150 calories");
        }else{
            System.out.println("invalid size");
        }
    }
}
/*
 Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino

			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"

			Note: MUST use nested if

 */