package day11_string;

import java.util.Scanner;

public class ReallyNeverMind {

    public static void main(String[] args) {

Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = input.nextLine();
if(word.endsWith("ly")){
    System.out.println("Really");

}else{

    System.out.println("Never mind");
}

    }
}
/*
Create a class named ReallyNeverMind. Ask the user to enter a word. if the word ends with "ly", print "really???" ,
 otherwise, print "never mind"
 */