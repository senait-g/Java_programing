package day11_string;

import java.util.Scanner;

public class WithOutFirstChar {

    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);

        System.out.println("Enter fruit name");
        String fruit1 = input.nextLine();

        System.out.println("Enter fruit name");

        String fruit2 = input.nextLine();

        fruit1 = fruit1.substring(1);
        fruit2 = fruit2.substring(2);

        System.out.println(fruit1 +fruit2);



    }
}
/*
Create a class named WithoutFirstChar. Ask user to enter two words. Print first word without its first character
    then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana
 */