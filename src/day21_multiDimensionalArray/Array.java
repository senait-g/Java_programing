package day21_multiDimensionalArray;

public class Array {
    public static void main(String[] args) {

        // we will have one array
        String[] array = {"Anna", "Mike", "Aliya", "Remus", "Gina", "Hannah", "Nathan", "Otto", "Kevin", "Kelly"};

        // I need to check each value from the array
        int counter = 0;
        for (String each : array) {
            //convert al letters into the lover case
            each = each.toLowerCase(); //anna

            //I will get the first letter
            char firstLetter = each.charAt(0);
            //   String firstLetter = each.charAt(0)+"";

            //I will get the last letter
            char lastLetter = each.charAt(each.length() - 1);
            //  String lastLetter = each.charAt(each.length() - 1)+ "";

            // I will compare the letters if same I will increment my counter

            //  if (firstLetter.equals(lastLetter)) {
            if (firstLetter == lastLetter) {
                counter++;
            }


        }
        System.out.println(counter);


    }
}

