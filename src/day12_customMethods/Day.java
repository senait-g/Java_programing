package day12_customMethods;

public class Day {

    public static void main(String[] org){

     day( 6);
    }

    public static void day(int day){

        switch (day){

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");

            default:
                System.out.println("Invalid day");

        }


    }

}

/*
 Create a method named day that can display the name of the day based on the given number to the method,
 if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        day(5)

        output:
            Friday

 */