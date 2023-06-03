package day17_customClass;

public class UniqueCharacters2 {

    public static void main(String[] args) {

        String str = "aabccd";

        String unique = " ";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(0);
            int frequency = 0;

            for (int i = 0; i < str.length(); i++) { // checks how many times the ch has appeared in str

                if (str.charAt(i) == ch) { //if the ch has appeared in the string
                    frequency++;  // increase the frequency by 1


                }

            }

            if (frequency == 1) {
                unique += ch;

            }

        }

        System.out.println(unique);
    }
}
/*
1.Write a program that can find the unique characters from a string

   Ex:
       str = "aabcccd"


       output:
       bd
 */