package day07;

public class AgeGroups {
    public static void main(String[] args) {

        int age = 149;
        String ageGroup = "";

        if (age >0 && age <= 150) {

            if (age > 50) {
                ageGroup = "Senior";
            } else if (age >=21) {
                ageGroup = "Adult";
            } else {
                ageGroup = "Teenager";
            }

        } else {
            ageGroup = "invalid";
        }
        System.out.println(ageGroup);
    }
}