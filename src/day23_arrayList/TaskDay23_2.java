package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
public class TaskDay23_2 {

    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<>();
        name.addAll(Arrays.asList("John","Ahmed","Daniel","Ahmed","James","Muhammed"));

        name.removeAll(Arrays.asList("Ahmed"));

        System.out.println(name);

    }
}
/*
Write a program that can remove all the names "Ahmed" from an arraylist of String
			ex:
                list = ["John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"];

            output:
            	["John", "Daniel", "James", "Muhammed"];

 */