package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class TaskDay23_4 {

    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();

        number.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));

        int n = 4;

        for(int i = 1; i < n; i++){

            number.removeAll(Arrays.asList(Collections.max(number)));

            System.out.println(Collections.max(number));
        }

    }
}
/*
write a program that can return the nth largest number from an arraylist
            ex:
	            arraylist = {1,2,3,4,5,6,7,7,8,8}
	            n = 5

            output:
                4
 */