package day04_concatenation;

public class PrimitiveTypeCasting {


    public static void main(String[] args) {


        //--------------Implicit Castings---------------




        byte a = 15;
        //short b = (short)a;


        short b = a;


        System.out.println(b);


        int c = a; // implicit casting

        long d = 3000L;

        float f = d; // implicit casting




        //---------------Explicit casting ------------




        int x = 100;

        byte y = (byte)x;

        float z = 20.8F;

        short q = (short)z; // z = 20.8

        System.out.println(q);


        double n1 = 2.5;

        byte n2 = (byte) n1;     //n1 = 2.5;


        System.out.println(n2);


        System.out.println("----------------------------------");



        int num = 500;

        var result = (byte) num;   /* explicit casting */


        System.out.println(500);



        int r = 50000;

        short t = (short) r;

        System.out.println(t);

        double u = 3000.5;

        int p = (int) u;  // explicit casting

        System.out.println(p);



    }






}
