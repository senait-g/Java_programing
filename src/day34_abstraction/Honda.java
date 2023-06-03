package day34_abstraction;

import day34_abstraction.day34_task.Car;

public final class Honda extends Car {
        public Honda(String model, int year, double price, String color) {
            super("Honda",model,year,price,color);
        }

        @Override
        public void drive() {
            System.out.println("Driving "+getMake()+" "+getModel()+" on the road");
        }

        @Override
        public void start() {
            System.out.println("Twist the key to ignition to start "+getMake()+" "+getModel());
        }

    @Override
    public void autoPilot() {

    }

}

