package day14_forloop;

import java.util.Scanner;

public class Day14Task4 {

    public static void main(String[] args) {

 Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:" );
        double num = scan.nextInt();

        double result = 1;

      for(int i = 0;i >= 1; i--){

          result *= i;
      }
        System.out.println("result = " + result);

        scan.close();
    }
}
/*
 Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

 */





