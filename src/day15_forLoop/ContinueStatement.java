package day15_forLoop;

public class ContinueStatement {

    public static void main(String[] args) {

        for (int i = 0; i < 6 ; i++) {

            if(i == 4){
                continue;
            }

            System.out.println(i);


        }

        System.out.println("===========================================================================");

        for (int i = 10; i < 21; i++) {

            if(i % 2 == 0){// if i is even

                continue;
            }

            System.out.println(i);

        }

        for (char i = 'A'; i <= 'G'; i++) {

            if(i == 'B'){
                continue;
            }

            System.out.println(i);

        }

    }
}
