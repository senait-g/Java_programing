package day32_finalkeyword.carTask_methodoverriding;

public class Audi extends Car {
    public Audi(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start(){
        System.out.println("Press the start button to start "+getMake()+" "+getModel());
    }



}

/*
  3. Audi
           start(): "Press the start button"
 */

