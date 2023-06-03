package day12_customMethods;

public class CapitalizationTask2 {

    public static void main(String[] orgs){

capitalization("cyDeo", "sCHooL");
    }

    public static void capitalization(String firstName, String lastName){

        firstName =firstName.substring(0,1).toUpperCase() + firstName.substring(1,firstName.length()).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1,lastName.length()).toLowerCase();
        System.out.println(firstName + " " + lastName);
    }




}
/*
Create a method named capitalization that can format the first and last names of the person and display the full name of the person
    Ex:
        capitalization("cyDeO", "sCHooL")

        output:
            full name: Cydeo School

 */