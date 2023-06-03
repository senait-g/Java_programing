package day10_string;

import java.util.Scanner;
public class EmployeeInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");

        String fullName = input.nextLine();

        System.out.println("Enter your age:");
        byte age = input.nextByte();

        System.out.println("Enter your gender:");
        char gender = input.next().charAt(0);

        input.nextLine();

        System.out.println("Enter your companyName:");
        String company = input.nextLine();

        System.out.println("Enter your job title:");
        String JobTitle = input.nextLine();

        System.out.println("Enter your salary:");
        double salary = input.nextDouble();


        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("companyName = " + company);
        System.out.println("jobTitle = " + JobTitle);
        System.out.println("salary = " + salary);

input.close();




    }
}
