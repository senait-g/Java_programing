package morningPractices;

import java.util.Scanner;

public class MorningPractice1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int colors = 1;
        String selected = "Here are the colors you picked:";

        while(colors <= 3){

            System.out.println("Enter color " + colors);
            String currentColor = input.nextLine().toLowerCase().trim();

            if (!selected.contains(currentColor)){

                selected += currentColor + " ,";
                colors++;
            }else{

                System.out.println(currentColor + " is already selected, please try again");
            }
        }

        System.out.println(selected);
    }
}
