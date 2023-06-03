package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
public class TaskDay23_3 {

    public static void main(String[] args) {

        ArrayList<Integer> duplicate = new ArrayList<>();

        duplicate.addAll(Arrays.asList(1,2,3,4,5));

        duplicate.addAll(duplicate);

        System.out.println(duplicate);
    }

}
/*
Write a program that can duplicate the elements of an arraylist
		 	ex:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,5,1,2,3,4,5];
 */