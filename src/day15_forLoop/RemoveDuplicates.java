package day15_forLoop;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "aabbbcccc";

        String result = "";

        for( int i = 0; i < str.length(); i++){ //i:index number of str

            char each = str.charAt(i); // each Character of the String str

            if(! result.contains("" + each) ){

                result += each; // then we will add the character to string result
            }
        }

        System.out.println(result);




    }


}
