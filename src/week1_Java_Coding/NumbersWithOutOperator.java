package week1_Java_Coding;

public class NumbersWithOutOperator {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 5;

        int result = 0;
        while(num1>=num2){
            num1 = num1-num2;
            result++;
        }
        System.out.println(result);
    }
}
