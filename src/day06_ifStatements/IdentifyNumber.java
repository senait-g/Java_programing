package day06_ifStatements;

public class IdentifyNumber {

    public static void main(String[] args) {

        int number = 200;

        boolean isPositive = number > 0; // if the number is greater than zero, then it's a positive number
        boolean isNegative = number < 0; // if the number is less than zero , then it's a negative number
        // if the number is equal to zero , then it is zero

        boolean isZero = !isPositive && !isNegative; // if the number is NOT positive and NOT negative, then it's zero


        System.out.println(number + " is posivite number: " + isPositive);

        System.out.println(number + " is negative number: " + isNegative);

        System.out.println(number + " is zero: " + isZero);







    }


}
