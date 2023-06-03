package day12_customMethods;

public class CustomMethodPractice {

    public static void main(String[] args){

        maxnum(100,200);

        System.out.println("====================================");

        maxnum(300,500);

        System.out.println("=========================");

        maxnum(400,50);

        System.out.println("====================================");

        maxnum(-200,20);

    }

    public static void maxnum(double num1, double num2) {

        if (num1 > num2) {

            System.out.println(num1 + " is the maximum number");

        } else if (num1 < num2) {

            System.out.println(num2 + " is the maximum number");
        } else {

            System.out.println("Equal");
        }

        System.out.println("====================================================");

        initial("Mohammad","Karim");

        // Create a method that can display the initials of a person (firstName, lastName)


        }
// Create a method that can display the initials of a person (firstName, lastName)

        public static void initial (String firstName, String lastName){

        String initial = firstName.charAt(0) + "." + lastName.charAt(0);

                System.out.println("initail is:" + initial);
            }


    }










