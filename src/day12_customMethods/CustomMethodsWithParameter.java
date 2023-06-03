package day12_customMethods;

public class CustomMethodsWithParameter {

     public static void main(String[] orgs){

         oddOrEven(100);

        oddOrEven(10000);
     }


     public static void oddOrEven(int number){

    if(number % 2 == 0){

        System.out.println(number + " is even number");


    }else{

        System.out.println(number + " is odd number");

    }





     }


}
