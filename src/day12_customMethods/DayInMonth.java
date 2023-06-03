package day12_customMethods;

public class DayInMonth {

    public static void main(String[] org){

    DayInMonth("april");
    }

    public static void DayInMonth(String month){

        String day31 = "january,march,may,july,august,october,december";
        String day28 = "february";
        String day30 = "april,june september,november";

        month = month.substring(0,1).toUpperCase() + month.substring(1).toLowerCase();

        if(day31.contains(month.toLowerCase())){

            System.out.println(month + " has 31 days");
        } else if (day30.contains(month.toLowerCase())){

            System.out.println(month + " has 30 days");

        }else if(day28.contains(month.toLowerCase())){

            System.out.println(month + " has 28 days");

            }else{

            System.out.println("Invalid month");

            }
        }

    }


/*
Create a method that can print how many days a month has
    Ex:
        month("jUNe")

        output:
            June has 30 days

 */